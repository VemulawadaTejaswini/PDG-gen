import java.util.*;
import java.lang.*;

/**
 * ExhaustiveSearch
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean[] list = new boolean[20 * 2001];

        for (int i = 0; i < 1 << n; i++) { // 全てのパターン
            int tmp = 0;
            for (int j = 0; j < n; j++) { // j文字目を足し算に入れるかどうか
                if ((i & (1 << j)) != 0) { // j が bit に入るかどうか
                    tmp += a[j];
                }
            }
            list[tmp] = true;
        }

        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            int num = Integer.parseInt(sc.next());
            if (list[num]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
