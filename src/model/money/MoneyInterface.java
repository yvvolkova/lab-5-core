package model.money;

public interface MoneyInterface {
    void addMoney(Money money);
    Money getMoney (double BalanceLess);
    Money getMoneyWithoutLess();
}
