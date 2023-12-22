import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            if (ok(n)) {
                System.out.println(n);
                return;
            }
            n++;
        }
    }
    public static boolean ok(int x) {
        boolean ret = true;
        int r = x % 10;
        while (x / 10 > 0) {
            x /= 10;
            if (x % 10 != r) ret = false;
            else r = x % 10;
        }
        return ret;
    }
}