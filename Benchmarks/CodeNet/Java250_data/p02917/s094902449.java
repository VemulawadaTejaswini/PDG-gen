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
        int[] B = new int[N];

        for (int i = 1; i <= N - 1; i++) {
            B[i] = sc.nextInt();
        }

        int sum = B[N - 1]; // decide A[N]
        for (int i = N - 1; i >= 1; i--) {
            // decide A[i]
            sum += Math.min(B[i], B[i - 1]);
        }
        sum += B[1];

        System.out.println(sum);
        return;
    }

}
