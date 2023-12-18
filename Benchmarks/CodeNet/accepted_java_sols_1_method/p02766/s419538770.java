import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;

        long kP = 1;

        while (kP <= N) {
            kP *= K;
            ans++;
        }
        System.out.println(ans);
    }
}