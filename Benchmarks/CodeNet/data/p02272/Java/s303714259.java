import java.io.*;
import java.util.*;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        mergeSort(A, 0, n);
        for (int i = 0; i < n-1; i++) {
            pw.print(A[i] + " ");
        }
        pw.println(A[n-1]);
        pw.println(cnt);
        pw.flush();
    }

    static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (L[i] <= R[j])
                A[k] = L[i++];
            else
                A[k] = R[j++];
            cnt++;
        }
    }

    static void mergeSort(int[] A, int left, int right) {
        if (left+1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
