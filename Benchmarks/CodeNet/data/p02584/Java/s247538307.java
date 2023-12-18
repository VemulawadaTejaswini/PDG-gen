import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        int t=1;
        //t=fs.nextInt();
        while(t-->0){
            solve(out,fs);
        }
        out.close();
    }
    public static void solve(PrintWriter out,FastReader fs){
        long x=fs.nextLong(),k=fs.nextLong(),d=fs.nextLong();
        x=Math.abs(x);
        long ans=Long.MAX_VALUE;
        for(int i=0;i<k;i++){
            ans=Long.min(ans,Math.abs(x-(k-2*i)*d) );
        }
        
        out.println(ans);
    }
}
class FastReader{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next(){
        while(!st.hasMoreTokens()){
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
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
    int[] nextIntArray(int n){
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=nextInt();
        return a;
    }
    long[] nextLongArray(int n){
        long a[]=new long[n];
        for(int i=0;i<n;i++)a[i]=nextInt();
        return a;
    }
    char[] nextCharArray(){
        char a[]=next().toCharArray();
        return a;
    }
}