import java.util.*;

public class Main {
    static final int MOD = 1_000_000_007;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        long res = a%MOD;
        
        for(int i = a-1; i > 0; i--){
            res=res*i%MOD;
        }
        System.out.println(res);
    }
}
