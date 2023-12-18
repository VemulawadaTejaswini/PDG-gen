import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] h = new long[n];
        int k = sc.nextInt();
        for(int i = 0; i < n; ++i) h[i] = sc.nextLong();
        Arrays.sort(h);
        n -= k;
        long ans = 0;
        for(int i = 0; i < n; ++i) ans += h[i];
        System.out.println(ans);
    }
}