import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int x[] = new int[n + 1];
        int y[] = new int[n + 1];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();

            double dist = Math.sqrt((double) x[i] * x[i] + (double) y[i] * y[i]);
            if (dist <= (double) d) {
                cnt++;
            }
        }
        System.out.println(cnt);
        scanner.close();
    }
}
