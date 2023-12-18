import java.util.*;

public class Main {
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        long x = Scan.nextLong();
        long k = Scan.nextLong();
        long d = Scan.nextLong();

        x = Math.abs(x);
        long cnt = Math.min(k, x / d);
        x -= cnt * d;
        k -= cnt;
        if(k % 2 == 1) x = Math.abs(x - d);

        System.out.println(x);
    }
}