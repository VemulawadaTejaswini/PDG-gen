import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        double tmp = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            tmp += (double)1/A[i];
        }
        System.out.print(1/tmp);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}