import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n0 = sc.nextLong();
        long m0 = sc.nextLong();
        long N = Math.max(m0,n0);
        long M = Math.min(m0,n0);
        long ans = 0;
        if(M==1){
            if(N==1) ans = 1;
            else ans += N-2;
        }
        else if(M>=3){
            ans += (M-2)*(N-2);
        }

        System.out.println(ans);
    }
}
