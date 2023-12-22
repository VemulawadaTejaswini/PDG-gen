import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ary = new int[n];
        int[] dif;
        if (n == 1) {
            System.out.println(k);
            return;
        }

        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        int ans = 0;
        int count = ary[0];
        for(int i = 1;i < n;i++){
            if(count + k < ary[i]){
                ans += k;
                count = ary[i];
            }else{
                ans += ary[i] - ary[i-1];
                count = ary[i];
            }
        }
        ans += k;
        System.out.println(ans);
    }

}