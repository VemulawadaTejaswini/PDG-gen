import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] x = new Integer[n];
        Integer[] y = new Integer[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double dx = Math.pow(Math.abs(x[i] - x[j]), 2);
                    double dy = Math.pow(Math.abs(y[i] - y[j]), 2);
                    double d = Math.sqrt(dx + dy);
                    sum += d;
                }
            }
        }
        double result = sum / n;

        // 出力
        System.out.println(result);
    }
}
