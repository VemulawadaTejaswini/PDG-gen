import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long a = x * y;

        for (long i = x; i <= a; i += x) {
            if (x % y != 0) {
                System.out.println(x);
                return;
            }
        }

        System.out.println(-1);
    }
}