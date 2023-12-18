import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static final FastReader in = new FastReader();
    static final FastWriter out = new FastWriter();


    public static void main(String[] args) throws IOException{
        long mod = (long) 1e9+7;
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextLong();

        long ans = 0L;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                ans += (a[i]*a[j])%mod;
            }
        }
        out.pl(ans%mod);
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
    String nextString(){
        return next().trim();
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
        out.flush();
    }
    void p(Object o){
        out.write(o.toString());
        out.flush();
    }
    void close(){
        out.flush();
        out.close();
    }  
}
