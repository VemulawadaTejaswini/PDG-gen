import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = 5;
        Scanner sc = new Scanner(System.in);
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
        }

        int loss = 0;
        int maxLoss = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (times[i]%10 == 0) {
                loss = 0;
            }
            else {
                loss = 10 - times[i] % 10;
                maxLoss = Math.max(loss, maxLoss);
            }
            ans += (times[i] + loss);
        }
        System.out.println(ans - maxLoss);
    }
}
