import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(sc.next());
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        boolean judge = true;
        for (int i = 0; i < n && judge; i++) {

            int pointSum = Math.abs(x[i]) + Math.abs(y[i]);

            if (t[i] < pointSum) {
                judge = false;

            } else if (pointSum < t[i]) {

                if (t[i] % 2 == 0 && pointSum % 2 == 1) {
                    judge = false;

                } else if (t[i] % 2 == 1 && pointSum % 2 == 0) {
                    judge = false;
                }
            }
        }

        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}