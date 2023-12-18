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
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        long ans = 1;
        boolean overflow = false;
        for (int i = 0; i < N; i++) {
            ans *= A[i];
            if (ans > THREASHOLD) {
                ans = -1;
                overflow = true;
            }
        }


        if (overflow && ans != 0) ans = -1;
        System.out.println(ans);
        return;
    }

}