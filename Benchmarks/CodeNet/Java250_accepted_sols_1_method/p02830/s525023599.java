import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        String s = input[0];
        String t = input[1];
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            ans.append(s.charAt(i));
            ans.append(t.charAt(i));
        }
        
        out.println(ans);
        out.close();
        
    }
}