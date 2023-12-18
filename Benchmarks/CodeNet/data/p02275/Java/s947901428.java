import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final int MAX_N = 2000000 + 10;
    static final int MAX_A = 10000 + 10;
    static int N;
    static int[] A = new int[MAX_N];
    static int[] B = new int[MAX_N];

    public static void main(String[] args) {
        read();
        CountingSort(A, B);
        for (int i = 0; i < N; i++) {
            if (i != N - 1) {
                System.out.print(String.format("%d ", B[i]));
            } else {
                System.out.println(B[i]);
            }
        }
    }

    static void CountingSort(int[] A, int[] B) {
        int[] C = new int[MAX_A];

        for (int i = 0; i < N; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i < MAX_A; i++) {
            C[i] += C[i - 1];
        }

        for (int i = N - 1; i >= 0; i--) {
            C[A[i]]--;
            B[C[A[i]]] = A[i];
        }
    }

    static void read() {
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
    }
}