import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int ans = -1;
        int min = 10000000;
        for (int i = 0; i < N; i++) {
            int H = sc.nextInt();
            int diff = Math.abs(T * 1000 - 6 * H - A * 1000);
            if (diff < min) {
                min = diff;
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}
