import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private Set<Integer> createSet(int M) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= M; i++) {
            set.add(i);
        }
        return set;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] ok = new boolean[M + 1];
        Arrays.fill(ok, true);

        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            Set<Integer> dislike = createSet(M);
            for (int j = 0; j < K; j++) {
                int A = sc.nextInt();
                if (dislike.contains(A)) {
                    dislike.remove(A);
                }
            }
            for (int A : dislike) {
                ok[A] = false;
            }
        }


        int cnt = 0;
        for (int i = 1; i <= M; i++) {
            if (ok[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);

        return;
    }

}