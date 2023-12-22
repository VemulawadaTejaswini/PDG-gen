import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long cnt = 0;
        long ans = 0;
        
        while(N!=0){
            N/=2;
            ans = ans + (long)Math.pow(2,cnt);
            cnt++;
        }
        System.out.println(ans);
    }
}