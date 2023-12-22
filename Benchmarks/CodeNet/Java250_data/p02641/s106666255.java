import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> nums = new HashSet<Integer>();
        for (int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }
        System.out.println(solve(x, n, nums));
    }
    static int solve(int x, int n, Set<Integer> nums){
        if (!(nums.contains(x))) return x;
        int cloSmall = x - 1, cloLarge = x + 1;
        boolean sml = false, lg = false;
        while (!(sml)){
            if (!(nums.contains(cloSmall))){
                sml = true;
            }else{
                cloSmall--;
            }
        }
        while (!(lg)){
            if (!(nums.contains(cloLarge))){
                lg = true;
            }else{
                cloLarge++;
            }
        }
        if (x - cloSmall == cloLarge - x){
            return Math.min(cloSmall, cloLarge);
        }else{
            return (x - cloSmall < cloLarge - x ? cloSmall : cloLarge);
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
