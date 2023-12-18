import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = 1;
        for (int i = 0; i < n; ++i) {
            long x = sc.nextLong();
            p *= x;
        }

        System.out.println(p < 0 || p > (long) 1e18 ? -1 : p);
    }
}
