import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    //static final int MAX = 2_147_483_646;
    static final int MAX = 10_000_000;
    // intの最大値
    static final int INF = 1_000_000_000;
    // 10^9

  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int an = sc.nextInt();
        int bn = sc.nextInt();
        String c = sc.next();
        if(a.equals(c)){
            an--;
        }
        if(b.equals(c)){
            bn--;
        }
        System.out.println(an + " " + bn);
    }
    
}


