import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long x = Long.parseLong(sc.next()); // axis
            long k = Long.parseLong(sc.next()); // count
            long d = Long.parseLong(sc.next()); // d

            // calc
            if (d <= Math.abs(x)) {
                long dnum = Math.min((Math.abs(x) / d), k);
                k = k - dnum;
                x = x - ((x >= 0) ? 1 : -1) * dnum * d;
            }
            if (k % 2 == 0) {
                System.out.println(Math.abs(x));
            } else {
                System.out.println(Math.abs(x + ((x > 0) ? -1 : 1) * d));
            }
        }
    }
}