import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, i, j;
        n = cin.nextInt();
        int[] A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = cin.nextInt();
        }
        
        int count = shellSort(A, n);
        
        System.out.println(count);
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
    static int shellSort(int[] A, int n) {
        int cnt = 0, m = 0, i;
        int[] g;
        if (n > 1) {
            g = new int[n];
        } else {
            g = new int[10];
        }
        g[0] = 1;
        while (g[m] <= n) {
            m++;
            g[m] = (int) Math.pow(2, m) * (int) Math.pow(3, m);
        }
        System.out.println(m);
        for (i = m - 1; i >= 0; i--) {
            System.out.print(g[i]);
            if (n > 0) System.out.print(" ");
            cnt += insertionSort(A, n, g[i]);
        }
        System.out.println();
        return cnt;
    }
    static int insertionSort(int[] A, int n, int g) {
        int i, v, j, cnt = 0;
        for (i = g; i < n; i++) {
            v = A[i];
            for (j = i - g; j >= 0 && A[j] > v; j -= g) {
                A[j + g] = A[j];
                cnt++;
            }
            A[j + g] = v;
        }
        return cnt;
    }
}
