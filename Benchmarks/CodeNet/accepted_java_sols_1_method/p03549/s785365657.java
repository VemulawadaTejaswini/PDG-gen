import java.util.*;

class Main {
    
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        n -= m;
        long ans = n*100 + 1900*m;
        ans *= (int)Math.pow(2,m);
        System.out.println(ans);
    }
}
