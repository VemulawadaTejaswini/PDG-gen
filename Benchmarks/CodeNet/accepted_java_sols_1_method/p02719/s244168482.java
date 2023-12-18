import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = n;
        boolean con = true;

        if(n%k==0){
            System.out.println(0);
            return;
        }

        if(n>=k && n%k != 0){
            n %= k;
        }

        while(con){
            long hikaku = Math.abs(n-k);
            n = hikaku;
            if(ans <=  hikaku){
                break;
            }
            ans = hikaku;
        }
        
        System.out.println(ans);
    }
}