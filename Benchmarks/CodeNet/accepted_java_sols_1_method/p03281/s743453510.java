import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i += 2) {
            int v = 0;
            for (int j = 1; j <= i; j += 2) {
                if (i % j == 0) v++;
            }

            if (v == 8) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
