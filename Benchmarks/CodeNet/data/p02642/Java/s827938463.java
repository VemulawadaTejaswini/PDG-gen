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
        int ans = 0;
        for (int i = 0; i < n; i++){
            boolean good = true;
            for (int j = 0; j < n; j++){
                if (nums[i] == nums[j]) {
                    if (i != j){
                        good = false;
                    }
                    continue;
                }
                if (nums[i] % nums[j] == 0){
                    good = false;
                }
            }
            if (good) ans++;
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
