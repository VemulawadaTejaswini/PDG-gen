import java.util.*;

class Main {
    // ABC152
    static final long MOD = 1_000_000_007;
    //10^9+7
    static final int MAX = 2_147_483_646;
    //intの最大値
    static final int INF = 1_000_000_000;
    //10^9
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n < m){
            for(int i = 0;i < m;i++){
                System.out.print(n);
            }
        }else{
            for(int i = 0;i < n;i++){
                System.out.print(m);
            }
        }

    }
}
