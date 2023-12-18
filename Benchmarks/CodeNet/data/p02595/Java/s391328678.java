import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int kijun = d*d;
        int ans = 0;

        for (int i=1;i<=n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int nagasa = x*x+y*y;
            if (kijun>=nagasa) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
