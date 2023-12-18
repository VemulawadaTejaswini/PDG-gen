import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        x = Math.abs(x);

        if (Long.MAX_VALUE/k < d) {
        } else {
            if (k * d < x) {
                System.out.println(x - (k * d));
                return;
            }
        }

        if (d > x) {
                if (k % 2 == 0) {
                    System.out.println(x);
                } else {
                    System.out.println(d - x);
                }
        } else {
            long dis = x % d;
            long move = x / d;
                if ((k - move) % 2 == 0) {
                    System.out.println(dis);
                } else {
                    System.out.println(d - dis);
                }
        }

        sc.close();

        }

    }

