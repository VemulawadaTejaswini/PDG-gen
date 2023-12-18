import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        sc.close();
        long ans = N;

        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N%i == 0){
                ans = Math.min(ans, (i-1)+(N/i-1));
            }
        }
        System.out.println(ans);
    }
}