import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] count = new int[n+1];
        long ans = 1;
        for(int i=2; i<=n; i++) {
            int x = i;
            for(int j=2; j<=i; j++) {
                if(x == 1) break;
                while(true) {
                    if(x % j == 0) {
                        x /= j;
                        count[j]++;
                    }else {
                        break;
                    }
                }
            }
            if(i == x) count[i]++;
            
        }
        
        
        for(int i=2; i<n+1; i++) {
            if(count[i] > 0) {
                ans *= (count[i]+1);
                ans = ans % 1000000007;
            }
        }
        System.out.println(ans);
        
    }   
}