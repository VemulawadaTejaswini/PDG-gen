import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    static final int MAX = 2_147_483_646;
    // intの最大値
    static final int INF = 1_000_000_000;

    // 10^9
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        long all = 0;
        for(int i = 0;i < n;i++){
            all += sc.nextInt();
        }
        if(all < h){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
   
}
