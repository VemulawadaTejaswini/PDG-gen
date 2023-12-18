import java.util.*;
import java.math.BigInteger;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static HashMap<Integer, Integer> memo;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        BigInteger x = new BigInteger(s, 2);
        int popcount = x.bitCount();
        
        BigInteger y = x.remainder(new BigInteger((popcount+1) + ""));
        BigInteger z = x.remainder(new BigInteger((popcount-1) + ""));
        
        int[] modx = {Integer.parseInt(y.toString(10)),Integer.parseInt(z.toString(10))};
        int[][] mod2beki = new int[n][2];
        mod2beki[0][0] = 1%(popcount+1);
        if(popcount==1){
            mod2beki[0][1] = 1%(popcount-1);
        }
        
        for(int i=1; i<n; i++){
            mod2beki[i][0] = mod2beki[i-1][0]*2%(popcount+1);
            if(popcount==1){
                mod2beki[i][1] = mod2beki[i-1][1]*2%(popcount-1);
            }
        }
        
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(popcount==1 && c=='1'){
                System.out.println(0);
                continue;
            }
            
            int j = Integer.parseInt(c + "");
            int res = modx[j];
            if(c=='0'){
                //mod popcount+1
                res += mod2beki[n-1-i][j];
                res %= popcount+1;
            }else{
                //mod popcount-1
                res -= mod2beki[n-1-i][j] - (popcount-1);
                res %= popcount-1;
            }
            System.out.println(calc(res)+1);
        }
    }
    
    public static int calc(int n){
        if(n==0){
            return 0;
        }
        
        int popcount = Integer.bitCount(n);
        int res = n%popcount;
        
        return calc(res)+1;
    }
}
