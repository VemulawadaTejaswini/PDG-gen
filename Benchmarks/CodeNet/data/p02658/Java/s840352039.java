import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = sc.nextLong();
        for (int i = 1; i < N; i++) {
            ans *= sc.nextLong();
            if (1000000000000000000L < ans || ans < 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}