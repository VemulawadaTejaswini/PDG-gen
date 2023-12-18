import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            // n = 0の場合は終了
            if (n == 0) {
                break;
            }

            int sum = 0;
            int maxSum = 0;
            for (int i = 0; i < n; i++) {
                int item = sc.nextInt();

                // sum + item >= 0の場合はそのまま加算を続ける
                if ((sum + item) >= 0) {
                    sum += item;
                } else {
                    sum = 0;
                }

                // 最大値を記録
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

            System.out.println(maxSum);
        }
    }
}