import java.util.Scanner;

public class Main {
    static int ans;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            ans = 0;
            slove(n, 0, 1);
            System.out.println(ans);
        }
    }

    public static void slove(int n, int c, int prev) {
        //System.out.println(c+" : "+n);
        if (n == 0) {
            ans++;
            return;
        }
        if (c == 4) {
            return;
        }
        for (int i = prev; i * i <= n; i++) {
            if (n - i * i >= 0)
                slove(n - i*i, c + 1, i);
        }
    }
}