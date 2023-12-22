import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0;i < 3;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = a[0] + a[1];
        System.out.println(ans);
    }
}