import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        String ans = "No";
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cranes, turtles;
        for (int i = 0; i < x+1; i++){
            cranes = x - i;
            turtles = i;
            if (y == ((cranes*2) + (turtles*4))) ans = "Yes";
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
