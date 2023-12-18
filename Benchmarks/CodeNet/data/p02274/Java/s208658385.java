import java.util.Scanner;

public class Main {

    static long count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, n);
        System.out.println(count);
    }

    private static void mergeSort(int[] s, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(s, left, mid);
            mergeSort(s, mid, right);
            merge(s, left, mid, right);
        }
    }

    private static void merge(int[] s, int left, int mid, int right) {
        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid + 1];
        System.arraycopy(s, left, L, 0, L.length - 1);
        System.arraycopy(s, mid, R, 0, R.length - 1);
        L[L.length - 1] = Integer.MAX_VALUE;
        R[R.length - 1] = Integer.MAX_VALUE;
        for (int i = 0, j = 0, k = left; k < right; k++) {
            if (L[i] <= R[j]) {
                s[k] = L[i];
                i++;
                count += j;
            } else {
                s[k] = R[j];
                j++;
            }
        }
    }
}