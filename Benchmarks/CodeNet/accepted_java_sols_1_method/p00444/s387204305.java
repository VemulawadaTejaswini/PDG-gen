import java.util.*;

public class Main {
    private static final int MONEY = 1000;
    private static final int[] coins = {0, 1, 2, 3, 4, 1, 2, 3, 4, 5};

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                int cng = MONEY - n;
                System.out.println(coins[cng % 10] + coins[cng / 10 % 10] + coins[cng / 100 % 10]);
            }
        }
    }
}