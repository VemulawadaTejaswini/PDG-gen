import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static void countingSort(int[] A, int[] B, int k) {
        final int n = B.length;
        final int[] C = new int[k + 1];

        for (int i = 0; i < n; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            C[i] += C[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = Integer.parseInt(in.next());
//            final int[] A = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        final int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(in.next());
        }
        final int[] B = new int[n];
        final int k = 10000;

        countingSort(A, B, k);

        System.out.println(Arrays.stream(B).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

