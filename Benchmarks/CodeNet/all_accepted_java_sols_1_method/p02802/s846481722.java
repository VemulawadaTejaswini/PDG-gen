import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
            s[i] = sc.next();
        }

        // 主処理
        int[] status = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < m; i++) {
            // 正答していない場合
            if (status[p[i] - 1] < 1) {
                if ("AC".equals(s[i])) {
                    status[p[i] - 1] = 1;
                } else {
                    count[p[i] - 1]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (status[i] < 1) {
                count[i] = 0;
            }
        }
        String result = Arrays.stream(status).sum() + " " + Arrays.stream(count).sum();

        // 出力
        System.out.println(result);
        sc.close();
    }
}