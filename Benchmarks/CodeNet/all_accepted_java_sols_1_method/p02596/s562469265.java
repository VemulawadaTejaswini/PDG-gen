import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = 0;
        int kijun = 0;
        while (ans < 10000000) {
            ans++;
            kijun=kijun*10+7;
            kijun = kijun%k;
            if (kijun == 0) {
                System.out.println(ans);
                return;
            }
        }
        System.out.println("-1");
    }
}
