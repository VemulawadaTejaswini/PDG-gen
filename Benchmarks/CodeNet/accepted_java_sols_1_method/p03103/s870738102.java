// Arrays.sortの第二引数にコンパレータを定義した場合
// 参考 -> #4529481

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] AB = new int[n][2];

        for (int i = 0; i < n; i++) {
            AB[i][0] = sc.nextInt();
            AB[i][1] = sc.nextInt();
        }

        Arrays.sort(AB, (x, y) -> Integer.compare(x[0], y[0]));

        long totalPrice = 0;
        int totalCnt = 0;
        for (int i = 0; i < n; i++) {
            long price = AB[i][0];
            int count = AB[i][1];

            if (count >= m - totalCnt) {
                totalPrice += (m - totalCnt) * price;
                break;
            } else {
                totalPrice += count * price;
                totalCnt += count;
            }
        }

        System.out.println(totalPrice);
    }
}