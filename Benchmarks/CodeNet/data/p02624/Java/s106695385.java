import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i * j <= n; j++) {
                d[i * j]++;
            }
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i * d[i];
        }
        System.out.println(ans);
    }

}
