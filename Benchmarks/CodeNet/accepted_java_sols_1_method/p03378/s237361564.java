import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] a = new Integer[m];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int cost0 = 0;
        int costN = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] < x) {
                cost0++;
            } else {
                costN++;
            }
        }

        int result = Math.min(cost0, costN);

        // 出力
        System.out.println(result);
    }
}
