import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int n = Integer.parseInt(sc.next());  // a
            int m = Integer.parseInt(sc.next());  // b
            int k = Integer.parseInt(sc.next());
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(sc.next());
            }
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(sc.next());
            }

            // calc
            int cnt = 0, ai = 0, bi = 0;
            while (true) {
                if ((ai < n && k < a[ai]) && (bi < m && k < b[bi])) break;
                if ((ai < n) && ( !(bi < m) || (a[ai] < b[bi]) )) {
                    k -= a[ai];
                    cnt++; ai++;
                } else if (bi < m) {
                    k -= b[bi];
                    cnt++; bi++;
                } else {
                    // 両方なし
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}