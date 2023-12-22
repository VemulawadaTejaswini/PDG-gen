import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        String ans = "No";
        int cnt = 0;

        for (; ; ) {
            if (A < B && B < C) {
                ans = "Yes";
                break;
            }
            if (cnt >= K) {
                break;
            }
            if (A >= B) {
                B = B * 2;
                cnt++;
                continue;
            }
            if (B >= C) {
                C = C * 2;
                cnt++;
                continue;
            }
        }

        System.out.println(ans);
    }
}
