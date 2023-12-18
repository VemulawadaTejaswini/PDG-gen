import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        final int N = in.nextInt();
        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {
                if (A[j - 1] > A[j]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                    count++;
                }
            }
            // print(A);
            // System.out.println(count);
        }
        print(A);
        System.out.println(count);
    }

    private static void print(int[] A) {
        if (A.length == 0)
            return;
        for (int i = 0; i < A.length - 1; i++)
            System.out.print(A[i] + " ");
        System.out.println(A[A.length - 1]);
    }
}