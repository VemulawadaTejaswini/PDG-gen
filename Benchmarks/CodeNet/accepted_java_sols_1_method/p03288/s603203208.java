import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 1200){
            System.out.println("ABC");
        }else if(a < 2800){
            System.out.println("ARC");
        }else{
            System.out.println("AGC");
        }
    }
}