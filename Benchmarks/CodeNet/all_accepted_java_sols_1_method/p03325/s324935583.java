import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            while (a[i] % 2 == 0) {
                a[i] /= 2;
                result++;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
