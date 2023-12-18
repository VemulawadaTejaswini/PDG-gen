import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] x = new Integer[m];
        Integer[] y = new Integer[m];
        for (int i = 0; i < m; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int[] ball = new int[n + 1];
        Arrays.fill(ball, 1);
        int[] red = new int[n + 1];
        red[1]++;
        for (int i = 0; i < m; i++) {
            ball[x[i]]--;
            ball[y[i]]++;
            if (0 < red[x[i]]) {
                red[y[i]] = 1;
                if (ball[x[i]] <= 0) {
                    red[x[i]] = 0;
                }
            }
        }
        int result = Arrays.stream(red).sum();

        // 出力
        System.out.println(result);
    }
}
