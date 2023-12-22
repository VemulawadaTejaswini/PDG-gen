import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ans += solve(a);
        }

        sc.close();

        System.out.println(ans);
    }

    private static int solve(int num) {
        if (num % 2 != 0) {
            return 0;
        } else {
            return solve(num / 2) + 1;
        }
    }
}