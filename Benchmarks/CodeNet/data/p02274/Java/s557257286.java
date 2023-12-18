import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    final static int SENTINEL = Integer.MAX_VALUE;

    static long merge(int[] A, int left, int mid, int right) {
        long cnt = 0;
        int n1 = mid - left;
        int n2 = right - mid;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        System.arraycopy(A, left, L, 0, n1);
        System.arraycopy(A, mid, R, 0, n2);
        L[n1] = SENTINEL;
        R[n2] = SENTINEL;

        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
                cnt += n1 - i;
            }
        }
        return cnt;
    }

    static long mergeSort(int[] A, int left, int right) {
        if (right - left > 1) {
            int mid = (left + right) / 2;
            long a = mergeSort(A, left, mid);
            long b = mergeSort(A, mid, right);
            long c = merge(A, left, mid, right);
            return a + b + c;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            final int[] A = Arrays.stream(in.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            long ret = mergeSort(A, 0, n);

            System.out.println(ret);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

