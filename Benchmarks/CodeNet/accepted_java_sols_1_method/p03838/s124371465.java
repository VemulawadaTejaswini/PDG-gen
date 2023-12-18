import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ans = 0;
        if (x < 0 & y > 0 || x > 0 && y < 0) {
            ans++;
        } else {
            if (x > y) {
                ans++;
                if (y > 0 || x < 0 ) {
                    ans++;
                }
            }
        }
        ans += Math.abs(Math.abs(x) - Math.abs(y));
        System.out.println(ans);
    }

}
