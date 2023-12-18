import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static final FastReader in = new FastReader();
    static final FastWriter out = new FastWriter();

    public static void main(String[] args) throws IOException{
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n-2; i++){
            for (int j = i+1; j < n-1; j++){
                for (int k = j+1; k < n; k++){
                    if (a[i]!=a[j]&&a[i]!=a[k]&&a[j]!=a[k]&&(a[i]+a[j]>a[k]&&a[j]+a[k]>a[i]&&a[i]+a[k]>a[j])&&(i!=j&&j!=k&&i!=k)){
                        //out.pl(i + " " + j + " " + k);
                        ans++;
                    }
                }
            }
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
