import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            bubbleSort(A, N);
            System.out.println(Arrays.stream(A).mapToObj(a -> "" + a)
                    .reduce((a, b) -> a + " " + b).get());
            System.out.println(count);
        }
    }

    static int count = 0;
    public static void bubbleSort(int[] A, int N) {
        count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = N - 1; j >= 1; j--) {
                if (A[j] < A[j - 1]) {
                    int tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                    flag = true;
                    count++;
                }
            }
        }
    }
}