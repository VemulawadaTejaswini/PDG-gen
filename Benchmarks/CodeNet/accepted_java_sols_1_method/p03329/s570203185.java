import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(1);

        int tmp = 1;
        while (true) {
            tmp *= 6;
            if (tmp > n) break;
            list.add(tmp);
        }

        tmp = 1;
        while (true) {
            tmp *= 9;
            if (tmp > n) break;
            list.add(tmp);
        }

        boolean[][] dp = new boolean[20][n + 1];
        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < dp[0].length; k++) {
                    if (k - list.get(j) >= 0 && dp[i - 1][k - list.get(j)]) {
                        dp[i][k] = true;
                    }
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            if (dp[i][n]) {
                System.out.println(i);
                return;
            }
        }
    }
}
