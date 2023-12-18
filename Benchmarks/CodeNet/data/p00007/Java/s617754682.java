import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int debt = 100000;
        final int n = scanner.nextInt();

        debt = calculateDebt(debt, n);

        System.out.println(debt);
    }

    static int calculateDebt (int debt) {
        final double INTEREST = 0.05;
        final int ROUNUD_UP_MONEY = 1000;

        debt *= 1 + INTEREST;
        final int fraction = debt % ROUNUD_UP_MONEY;
        if (fraction > 0) {
            debt = debt - fraction + ROUNUD_UP_MONEY ;
        }

        return debt;
    }

    static int calculateDebt (int debt, int time) {
        for (int i = 0; i < time; i++) {
            debt = calculateDebt(debt);
        }

        return debt;
    }

}