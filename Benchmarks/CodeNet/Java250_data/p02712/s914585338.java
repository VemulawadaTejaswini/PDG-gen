import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        
        for(int i = 1; i <= n; i++){
            if((i % 3 != 0) && (i % 5 != 0)){
                ans += i;
            }
        }
         
        out.println(ans);
        out.close();
        
    }
}