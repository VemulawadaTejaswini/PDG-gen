import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int remain = n - k;
        int result = (int) Math.ceil((double) remain / (k - 1)) + 1;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
