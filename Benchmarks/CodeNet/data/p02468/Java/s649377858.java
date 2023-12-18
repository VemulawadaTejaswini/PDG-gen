import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long ans = 1;
        long mod = 1000000007;
        while(n > 0){
            if(n % 2 == 1)
                ans = (ans * m) % mod;
            m = (m * m) % mod;
            n /= 2;
        }
        System.out.println(ans);
    }
}
