import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long d = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            if (x * x + y * y <= d * d) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}