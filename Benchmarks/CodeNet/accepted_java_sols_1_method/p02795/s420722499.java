import java.util.*;

class Main {
    // 
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();   
        int high = n<m?m:n;
        int ans = 1+(l-1)/high;
        System.out.println(ans);
    }
}
  