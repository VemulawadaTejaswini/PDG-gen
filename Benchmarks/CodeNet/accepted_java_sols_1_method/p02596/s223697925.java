
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        scan.close();

        if (k % 2 == 0 || k % 5 == 0) {
            System.out.println(-1);
            return;
        }

        int ans = 1;
        int now = 7;
        int tenMod = 7;

        while (now % k != 0) {
            tenMod *= 10;
            tenMod %= k;
            now = (now + tenMod) % k;
            ans++;
        }

        System.out.println(ans);
    }
}
