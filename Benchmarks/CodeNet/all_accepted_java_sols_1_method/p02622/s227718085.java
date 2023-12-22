import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s1 = br.readLine().trim();
        String s2 = br.readLine().trim();
        int cnt=0;
        int n = Math.min(s1.length(), s2.length());
        for(int i=0;i<n;i++) {
            if(s1.charAt(i)!=s2.charAt(i))++cnt;
        }
        out.println(cnt);
        out.flush();
    }
}