import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
      // we are filling the dp from 0 to k , for the ans we check wheather at k
      // point First player is reachable or not...
        boolean[] dp = new boolean[k+1];
       Arrays.fill(dp,false);  // Initially all are unreachable state
        for(int i = 1; i <= k; i++){
            for(int j = 0; j < n; j++){
                if(i < a[j]) 
                    break;
              if(dp[i-a[j]]==false){ 
                dp[i]=true;    //it means this state is reachable 
                break;
              }         
            }
        }
        System.out.println(dp[k] ? "First" : "Second");
    }
}
