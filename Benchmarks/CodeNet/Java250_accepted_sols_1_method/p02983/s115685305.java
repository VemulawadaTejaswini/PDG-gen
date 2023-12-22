import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextInt();
        long R = scanner.nextInt();
        scanner.close();

        R = Math.min(R, L + 4038);

        long ans = 2018;
        for(long i = L; i < R; i++) {
            for(long j = i + 1; j <= R; j++) {
                ans = Math.min(ans, i * j % 2019);
            }
        }
        System.out.println(ans);
    }
}