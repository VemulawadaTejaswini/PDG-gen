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
        int[] a = new int[N];

        for (int i= 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int[] pop = new int[9];
        for (int i = 0; i < N; i++) {
            pop[Math.min(a[i]/400, 8)]++;
        }

        int cnt1 = 0;
        for (int i = 0; i < 8; i++) {
            if (pop[i] > 0) cnt1++;
        }

        if (cnt1 == 0 && pop[8] > 0) {
            cnt1 = 1;
            pop[8]--;
        }

        int cnt2 = cnt1 + pop[8];
        System.out.println(cnt1 + " " + cnt2);

        return;
    }

}