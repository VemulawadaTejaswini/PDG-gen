import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static final int         MAX = 200000;
    public static void main(String[] args) throws Exception {
        // 入力
        int             n = 0;
        int[]           A = new int[MAX];
        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));) {
            n = Integer.parseInt(br.readLine());
            String[]        lines = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(lines[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long        ans = mergeSort(A, n, 0, n);

        // 出力
/*        StringBuilder       sb = new StringBuilder();
        sb.append(A[0]);
        for (int i = 1; i < n; i++) {
            sb.append(" ");
            sb.append(A[i]);
        }
        System.out.println(sb);
*/
        System.out.println(ans);
    }

    static long mergeSort(int[] A, int n, int left, int right) {
        int         mid = 0;
        long        c1, c2, c3;
        if (left + 1 < right) {
            mid = (left + right) / 2;
            c1 = mergeSort(A, n, left, mid);
            c2 = mergeSort(A, n, mid, right);
            c3 = merge(A, n, left, mid, right);
            return c1 + c2 + c3;
        } else {
            return 0;
        }
    }

    static int[]       L = new int[MAX / 2 + 2];
    static int[]       R = new int[MAX / 2 + 2];
    static final int        SENTINEL = 2000000000;
    static long merge(int[] A, int n, int left, int mid, int right) {
        int         n1 = mid - left;
        int         n2 = right - mid;
        for (int i = 0; i < n1; i++) L[i] = A[left + i];
        for (int i = 0; i < n2; i++) R[i] = A[mid + i];
        L[n1] = SENTINEL;
        R[n2] = SENTINEL;

        long        c = 0;
        int     iteratorL = 0;
        int     iteratorR = 0;
        for (int i = left; i < right; i++) {
            if (L[iteratorL] <= R[iteratorR]) {
                A[i] = L[iteratorL];
                iteratorL++;
            } else {
                A[i] = R[iteratorR];
                iteratorR++;
                c += n1 - iteratorL;
            }
        }

        return c;
    }
}

