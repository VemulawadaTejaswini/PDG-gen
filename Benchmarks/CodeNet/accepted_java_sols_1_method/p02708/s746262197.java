import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        long n = sc.nextLong()+1;
        long k = sc.nextLong();
        long ans = 0;
        long max = 0;
        long min = 0;
        for(long i = 1; i <= n; i++){
            max += n-i;
            min += i-1;
            if(k <= i){
                ans += (max-min+1)%mod;
                ans %= mod;
            }
            
        }
        System.out.println(ans);
    }
}
