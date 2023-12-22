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
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int max = 0;
        int cnt = 0;
        int cur = H[0];
        for (int i = 1; i < N; i++) {
            if (cur >= H[i]) {
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(cnt, max);
            cur = H[i];
        }

        System.out.println(max);
        return;
    }

}