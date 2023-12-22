import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC159A - The Number of Even Pairs

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long ans = 0;
        if (n > 1) {
            int ans1 = 0;
            for (int i = n - 1; i > 0 ; i--) {
                ans1 += i;
            }
            ans += ans1;
        }
        if (m > 1) {
            int ans2 = 0;
            for (int i = m - 1; i > 0 ; i--) {
                ans2 += i;
            }
            ans += ans2;
        }

        System.out.println(ans);
    }
}
