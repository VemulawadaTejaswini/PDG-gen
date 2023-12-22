import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        String s = in.nextLine();
        if (n % 2 != 0){
            out.pl("No");
        }else if (!(s.substring(0, n/2).equals(s.substring(n/2, n)))){
            out.pl("No");
        }else{
            out.pl("Yes");
        }
        /*
        if (n % 2 != 0){
            out.pl("No");
        }else{
            HashSet<Character> h = new HashSet<Character>();
            for (int i = 0; i < n; i++){
                h.add(s.charAt(i));
            }
            if (n / 2 == h.size()){
                out.pl("Yes");
            }else{
                out.pl("No");
            }
        }
        */
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
