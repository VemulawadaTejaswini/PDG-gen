import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = sc.nextLong();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long x =sc.nextLong();
            long y =sc.nextLong();
            if (x*x + y*y <= d*d) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}