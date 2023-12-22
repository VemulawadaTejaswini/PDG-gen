import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = Math.max(2*A-1, Math.max(2*B-1,A+B));
        System.out.println(C);
    }
}