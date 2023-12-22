import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int n = in.length();
        String t1 = new StringBuilder(in).reverse().toString();
        
        String s1 = in.substring(0,(n-1)/2);
        String t2 = new StringBuffer(s1).reverse().toString();
        
        String s2 = in.substring((n+3)/2-1, n);
        String t3 = new StringBuffer(s2).reverse().toString();
        
        System.out.println(s1.equals(t2)&&s2.equals(t3)&&in.equals(t1) ? "Yes" : "No");
    }
}