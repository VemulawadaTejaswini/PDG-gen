import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long kijun = d*d;
        int ans = 0;

        for (int i=1;i<=n;i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long nagasa = x*x+y*y;
            if (kijun>=nagasa) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
