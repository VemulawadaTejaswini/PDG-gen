import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] A;
    static int c = 0;

    public static void main(String[] args) {
        n = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        mergeSort(0, n);

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(String.format("%d ", A[i]));
            } else {
                System.out.print(String.format("%d\n", A[i]));
            }
        }
        System.out.println(c);
    }

    static void merge(int l, int m, int r) {
        int n1 = m - l, n2 = r - m;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = A[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = A[m + i];
        }

        L[n1] = 1 << 31 - 1;
        R[n2] = 1 << 31 - 1;

        int i = 0, j = 0;
        for (int k = l; k < r; k++) {
            c++;

            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    static void mergeSort(int l, int r) {
        if (l + 1 < r) {
            int m = (r + l) / 2;
            mergeSort(l, m);
            mergeSort(m, r);
            merge(l, m, r);
        }
    }
}