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

        int v = N;
        int ans = 1;
        int cnt = 0;
        while (v > 1) {
            v >>= 1;
            cnt++;
            ans *= 2;
        }

        System.out.println(ans);

        return;
    }

}