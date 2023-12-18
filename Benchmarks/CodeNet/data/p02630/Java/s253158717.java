import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] nums = new int[n];
        long curSum = 0L;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            nums[i] = a;
            curSum += (long)a;
        }
        int q = sc.nextInt();
        int si, bi;
        for (int i = 0; i < q; i++){
            si = sc.nextInt();
            bi = sc.nextInt();
            for (int j = 0; j < n; j++){
                if (nums[j] == si){
                    curSum += (long) bi - si;
                    nums[j] = bi;
                }
            }
            System.out.println(curSum);
        }
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
