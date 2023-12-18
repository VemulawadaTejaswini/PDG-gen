import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(a, Collections.reverseOrder());
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                alice += a[i];
            } else {
                bob += a[i];
            }
        }
        int result = alice - bob;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
