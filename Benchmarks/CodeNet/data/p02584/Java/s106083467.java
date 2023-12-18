import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long k = scan.nextLong();
        long d = scan.nextLong();
        while (x > 0 && k > 0) {
            x -= d;
            k--;
        }
        long ans;
        if (k == 0) {
            ans = Math.abs(x);
        } else {
            long tmp = k % 2 == 1 ? x + d : x;
            ans = Math.abs(tmp);
        }
        System.out.println(ans);
    }
}
