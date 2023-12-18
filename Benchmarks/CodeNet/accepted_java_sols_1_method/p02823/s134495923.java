import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long diff = b-a;
        long ans = 0L;
        if(diff % 2L == 0){
            ans = diff / 2L;
        }else{
            long h = (n+1L)/2L;
            if(b <= h){
                ans = b-1L;
            }else if(h < a){
                ans = n-a;
            }else if(n-a < b-1L){
                ans = n-a;
            }else{
                ans = b-1L;
            }
            if(1 < b-a) ans -= (b-a-1L)/2L;
        }
        System.out.println(ans);
        sc.close();

    }

}
