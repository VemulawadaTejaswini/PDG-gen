
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = Long.parseLong(scan.next());
        scan.close();

        int ans = 0;
        long value = 100;
        while (value < x) {
            long add = value / 100;
            value += add;
            ans++;
        }

        System.out.println(ans);
    }
}
