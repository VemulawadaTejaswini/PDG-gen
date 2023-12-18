import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 1000000;
        int tList[] = new int[181];
        for (int i = 1; i < 181; i++) {
            tList[i - 1] = i * (i + 1) * (i + 2) / 6;
        }
        int dp[] = new int[max + 1];
        int dpOdd[] = new int[max + 1];
        dp[0] = 0;
        dpOdd[0] = 0;
        for (int i = 1; i <= max; i++) {
            int dpmin = Integer.MAX_VALUE;
            int dpOddmin = Integer.MAX_VALUE;
            for (int j : tList) {
                if (j > i)
                    break;
                if (dp[i - j] < dpmin) {
                    dpmin = dp[i - j];
                }
                if (j % 2 != 0 && dpOdd[i - j] < dpOddmin) {
                    dpOddmin = dpOdd[i - j];
                }
            }
            dp[i] = dpmin + 1;
            dpOdd[i] = dpOddmin + 1;
        }
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.nextLine();
            int input = Integer.parseInt(str);
            if (input == 0)
                break;
            System.out.printf("%d %d%n", dp[input], dpOdd[input]);
        }
    }
}
