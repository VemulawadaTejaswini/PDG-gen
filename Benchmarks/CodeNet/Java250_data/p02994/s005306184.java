import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int min = 0;
        int prevTaste = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int taste = L + (i + 1) - 1;
            sum += taste;

            // 初回
            if (i == 0) {
                min = L;
            }
            // 2回目以降
            else {
                if (Math.abs(taste) < Math.abs(prevTaste)) {
                    min = taste;
                }
            }

            prevTaste = taste;
        }
        System.out.print(sum - min);

    }
    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
