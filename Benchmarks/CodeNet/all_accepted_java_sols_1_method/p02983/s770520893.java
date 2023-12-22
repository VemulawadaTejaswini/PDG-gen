import java.util.*;

public class Main {

    static int mod = 2019;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long lmod = l % mod;
        long diff = r - l;
        if(2019 <= lmod + diff) System.out.println(0);
        else{
            long ans = 2019;
            for (long i = l; i < r; i++) {
                for (long j = i+1; j <= r; j++) {
                    ans = Math.min(ans, i * j % mod);
                }
            }
            System.out.println(ans);
        }
        sc.close();

    }

}
