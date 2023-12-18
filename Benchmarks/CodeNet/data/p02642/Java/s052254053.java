import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] dp = new int[1000001];
        Arrays.sort(nums);
        for (int i = 1; i < n; i++){
            if (nums[i] == nums[i-1] && dp[nums[i]] == 0){
                for (int j = nums[i]; j < dp.length; j+=nums[i]){
                    dp[j] = 1;
                }
            }
        }
        
        int elm, ans = 0;
        for (int i = 0; i < n; i++){
            elm = nums[i];
            if (dp[elm] == 1) continue;
            ans++;
            for (int j = elm; j < dp.length; j+=elm){
                dp[j] = 1;
            }
        }
        System.out.println(ans);
    }
}
class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 
    public FastReader() { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
    String next(){ 
        while (st == null || !st.hasMoreElements()) { 
            try{ 
                st = new StringTokenizer(br.readLine()); 
            }catch (IOException  e){ 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
    int nextInt(){ 
        return Integer.parseInt(next()); 
    } 
    long nextLong(){ 
        return Long.parseLong(next()); 
    } 
    double nextDouble(){ 
      return Double.parseDouble(next()); 
    } 
    String nextLine(){ 
        String str = ""; 
        try{ 
            str = br.readLine(); 
        } 
        catch (IOException e){ 
            e.printStackTrace(); 
        } 
        return str; 
    } 
}
