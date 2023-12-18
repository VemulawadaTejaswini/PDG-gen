import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();
        long ans;

        if (a < 0 && c <0) {
            ans = Math.max(a * c, b*d);
        }
        else if (a < 0 && c>=0) {
            ans = Math.max(b * c, b*d);
        }
        else if (a>=0 && c <0) {
            ans = Math.max(a*d, b*d);
        }
        else {
            ans = b*d;
        }
        System.out.println(ans);
    }
}