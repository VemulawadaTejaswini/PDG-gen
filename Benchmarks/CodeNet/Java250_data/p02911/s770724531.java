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
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[Q];

        int[] sdiff = new int[N + 1];
        for (int i = 0; i < Q; i++) {
            A[i] = sc.nextInt();
            sdiff[A[i]]++;
        }

        for (int i = 1; i <= N; i++) {
            int score = K + sdiff[i] - Q;
            if (score > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        return;
    }

}