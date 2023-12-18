import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long[] d = new long[40];
        d[0] = 1L;
        for (int i = 1; i < 40; i++) {
            d[i] = d[i-1] * 2;
        }
        long ans = 0L;
        for (int i = 0; i < 40; i++) {
            if(h < d[i]) break;
            ans += d[i];
        }
        System.out.println(ans);
        sc.close();

    }

}
