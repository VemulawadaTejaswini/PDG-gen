import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] S = new long[n];
        for (int i = 0; i < n; i++) S[i] = Integer.parseInt(sc.next());

        int cnt = 0;

        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            long T = Integer.parseInt(sc.next());
            if (search(S, n, T)) cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean search(long[] A, int n, long key) {
//        return Arrays.binarySearch(A, key) >= 0;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] == key) {
                return true;
            } else if (key < A[m]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}

