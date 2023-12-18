import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        long[] a = new long[n];
        long key = 1;
        long ans = 1;
        
        for(int i = 0; i < n; i++){
            a[i] = Long.parseLong(str[i]);
        }
        
        for(int i = 0; i < n; i++){
            ans *= a[i];
        }
        
        for(int i = 0; i < 18; i++){
            key *= 10;
        }
        
        out.println(ans <= key ? ans : -1);
        out.close();
        
    }
}