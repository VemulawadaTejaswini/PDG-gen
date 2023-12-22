import java.util.*;
public class Main{
    public static void main(String[] args){
        final long mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a = 1;
        long b = 1;
        long c = 1;
        long d = 1;
        for(int i = 0; i < n; i++){
            //0~9のいずれかをN個並べてできる数列の数
            a *= 10;
            a %= mod;
            //1~8のいずれかをN個並べてできる数列の数
            b *= 8;
            b %= mod;
            //0~8のいずれかをN個並べてできる数列の数
            c *= 9;
            c %= mod;
            //1~9のいずれかをN個並べてできる数列の数
            d *= 9;
            d %= mod;
        }
        //条件を満たす数列の数
        long ans = (a - (c + d - b)) % mod;
        if(ans < 0){
            ans += mod;
        }
        
        System.out.println(ans);
    }
}