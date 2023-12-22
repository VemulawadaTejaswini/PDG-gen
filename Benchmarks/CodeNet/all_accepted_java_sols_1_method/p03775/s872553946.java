import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long r = Long.MAX_VALUE;
        for (long a = 1; a*a <= N; a++) {
            if (N % a == 0) {
                long b = N / a;
                long m = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
                r = Math.min(r,m);
            }
        }
        System.out.println(r);
    }
}