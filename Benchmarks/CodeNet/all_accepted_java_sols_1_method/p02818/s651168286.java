import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long A = Long.parseLong(sc.next());
        final long B = Long.parseLong(sc.next());
        final long K = Long.parseLong(sc.next());
        sc.close();

        long a = A;
        long b = B;
        long k = K;
        if (a>=k) {
            a -= k;
            k = 0;
        } else {
            k -= a;
            a = 0;
        }
        if (b>=k) {
            b -= k;
            k = 0;
        } else {
            k -= b;
            b = 0;
        }

        System.out.println(a + " " + b);
    }
}