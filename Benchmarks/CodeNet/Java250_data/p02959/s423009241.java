import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];

        for (int i = 0; i < N + 1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        long sum = 0;
        int carry = 0;
        for (int i = 0; i < N + 1; i++) {
            if (A[i] >= carry) {
                A[i] -= carry;
                sum += carry;
            } else {
                sum += A[i];
                A[i] = 0;
            }

            if (i == N) {
                break;
            }

            if (B[i] > A[i]) {
                int diff = B[i] - A[i];
                sum += A[i];
                carry = diff;
            } else {
                sum += B[i];
                carry = 0;
            }
        }

        System.out.println(sum);
        return;
    }

}