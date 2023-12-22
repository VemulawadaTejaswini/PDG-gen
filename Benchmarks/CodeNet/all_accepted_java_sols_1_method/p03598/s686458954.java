import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int robot[] = new int[N];
        int ans = 0;
        for (int i = 0; N > i; i++) {
            robot[i] = sc.nextInt();
        }
        for (int j = 0; N > j; j++) {
            if (robot[j] < K - robot[j]) {
                ans += 2 * robot[j];
            } else {
                ans += 2 * (K - robot[j]);
            }
        }
        System.out.println(ans);
    }
}