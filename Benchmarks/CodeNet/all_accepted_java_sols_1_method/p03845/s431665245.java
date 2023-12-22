import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(sc.next());
        }
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
            x[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int sum = Arrays.stream(t).sum();
        String[] time = new String[m];
        for (int i = 0; i < m; i++) {
            int diff = t[p[i] - 1] - x[i];
            time[i] = Integer.toString(sum - diff);
        }

        String result = String.join("\n", time);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
