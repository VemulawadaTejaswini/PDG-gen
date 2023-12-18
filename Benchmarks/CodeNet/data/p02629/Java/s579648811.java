import java.io.*;
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        out.println(go(Long.parseLong(br.readLine().trim())));
        out.flush();
    }
    public static String go(long n){
        if(n==0) return "";
        --n;
        return go(n/26)+((char)('a'+(n%26)));
    }
}