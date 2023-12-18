import java.util.Scanner;

public class Main {
    private static void reslove(Scanner sc) {
        int k = sc.nextInt();
        if (k % 2 == 0 || k % 5 == 0) {
            System.out.println(-1);
            return;
        }
        int cur = 7 % k;
        int ans = 1;
        while (cur != 0) {
            cur = cur * 10 + 7;
            cur %= k;
            ans++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reslove(sc);
        sc.close();
    }
}
