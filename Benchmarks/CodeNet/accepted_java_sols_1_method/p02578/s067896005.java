import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        long count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                long diff = a[i - 1] - a[i];
                count += diff;
                a[i] += diff;
            }
        }
        long result = count;

        // 出力
        System.out.println(result);
    }
}
