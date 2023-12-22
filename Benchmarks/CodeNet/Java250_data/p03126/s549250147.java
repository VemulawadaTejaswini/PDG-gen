import java.util.Scanner;

class Problem {
    private int N;
    private int M;
    private int[] As;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        As = new int[M];
        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            for (int k = 0; k < K; k++) {
                int A = sc.nextInt();
                As[A-1] += 1;
            }
        }
    }

    int solve() {
        int ans = 0;
        for (int i = 0; i < M; i++){
            if (As[i] == N){
                ans += 1;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
