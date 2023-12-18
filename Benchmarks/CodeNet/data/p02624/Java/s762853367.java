import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 0;
        int[] num = new int[100000001];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; i * j <= n; j++) {
                num[(int)i * j]++;
            }
        }
        for (int i = 2; i <= n; i++) {
            ans += (num[i] + 1) * i;
        }
        System.out.println(ans + 1);
    }
}