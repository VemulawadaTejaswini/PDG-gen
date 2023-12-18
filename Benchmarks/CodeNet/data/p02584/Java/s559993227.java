import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static final FastReader in = new FastReader();
    static final FastWriter out = new FastWriter();

    public static void main(String[] args) throws IOException{
        long x, k, d;
        x = in.nextLong(); // start
        k = in.nextLong(); // amount of moves 
        d = in.nextLong(); // x-d || x+d
        long ans = x;
        long up = x;
        long down = x;
        if (x==k&&k==d){
            out.pl(x);
            return;
        }
        for (long i = 0; i < k; i++){
            ans = Math.min(ans, Math.abs(up-d));
            ans = Math.min(ans, Math.abs(down+d));
            up -= d;
            down += d;
        }
        out.pl(ans);
        out.close();
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
class FastWriter{
    PrintWriter out;
    FastWriter(){
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	out.flush();
    }
    void pl(Object o){
        out.write(o.toString());
	    out.write("\n");
        out.flush();
    }
    void pl(){
        out.write("\n");
    }
    void p(Object o){
        out.write(o.toString());
    }
    void close(){
        out.flush();
        out.close();
    }  
}
