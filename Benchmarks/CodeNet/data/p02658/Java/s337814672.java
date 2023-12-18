import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long THREASHOLD=1000000000000000000L;
        int N = sc.nextInt();
        long[] A = new long[N];
        boolean zero = false;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            if (A[i] == 0) zero = true;
        }
        if (zero) {
            System.out.println("0");
            return;
        }

        long ans = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] > THREASHOLD/ans) {
                ans = -1;
                break;
            }
            ans *= A[i];
        }

        System.out.println(ans);
        return;
    }

}