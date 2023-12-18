import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long e = Long.parseLong(sc.next());
        sc.close();
        long min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        long ans = n / min + 4;
        if (n % min != 0) {
            ans++;
        }
        System.out.println(ans);
    }
}