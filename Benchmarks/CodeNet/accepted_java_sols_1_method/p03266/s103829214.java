import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long ans = 0;
        long a = N/K;
        ans += a*a*a;
        if(K%2 == 1){
            System.out.println(ans);
            return;
        }else{
            long b = 0;
            if(N >= K/2) b += (N-K/2)/K+1;
            ans += b*b*b;
            System.out.println(ans);
        }
    }
}