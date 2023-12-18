import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            int v = sc.nextInt();
            if(map.containsKey(k)){
                if(map.get(k) > v){
                    map.put(k,v);   
                }
            }else{
                map.put(k,v);
            }
        }
        long[][] dp = new long[h+1][map.size()+1];
        
        for(int i = 0; i <= h; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        int j = 1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();
            for(int i = 0; i <= h; i++){
                if(i < k){
                    dp[i][j] = Math.min(dp[i][j-1], v);
                }else{
                    dp[i-k][j] = Math.min(dp[i-k][j], dp[i-k][j-1]);
                    dp[i][j] = Math.min(dp[i][j-1], dp[i-k][j] + v);
                }
            }
            j++;
        }
        System.out.println(dp[h][map.size()]);
    }
}