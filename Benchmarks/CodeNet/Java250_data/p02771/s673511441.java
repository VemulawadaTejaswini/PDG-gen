import java.util.*;

class Main {
    // 
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b){
            if(a==c){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else if(b==c){
            System.out.println("Yes");
        }else if(a==c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}