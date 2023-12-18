
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Integer.parseInt(scan.next());
        long d = Integer.parseInt(scan.next());
        long max = d*d;

        int ans = 0;
        for (int i = 0; i < n; i++) {
            long x = Integer.parseInt(scan.next());
            long y = Integer.parseInt(scan.next());
            if (x*x+y*y <= max) {
                ans++;
            }
        }
        scan.close();

        System.out.println(ans);
    }
}
