
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        String S = sc.next();
        char[] ch = S.toCharArray();
        boolean[] b = new boolean[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            b[i] = ch[i] == 'L';
        }
        int ans = 0;
        do {
            // System.out.println(cnt + Arrays.toString(b));
            if (!(cnt < K))
                break;

            for (int i = 0; i < N - 1; i++) {
                if (b[i] && !b[i + 1]) {
                    cnt++;
                    for (int p = i + 1; p < N && !b[p]; p++) {
                        b[p] = !b[p];
                    }
                } else if (!b[i] && b[i + 1]) {
                    cnt++;
                    for (int p = i + 1; p < N && b[p]; p++) {
                        b[p] = !b[p];
                    }
                }
                if (!(cnt < K))
                    break;
            }
        } while (false);
        System.err.println(cnt + Arrays.toString(b));
        for (int i = 1; i < N; i++) {
            if (b[i - 1] && b[i])
                ans++;
        }
        for (int i = 0; i < N - 1; i++) {
            if (!b[i] && !b[i + 1])
                ans++;
        }
        System.out.println(ans);
    }
}