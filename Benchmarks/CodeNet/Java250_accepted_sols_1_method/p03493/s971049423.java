import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int ans = 0;
        
        for(int i = 0; i < 3; i++){
            if(s.charAt(i) == '1'){
                ans++;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}