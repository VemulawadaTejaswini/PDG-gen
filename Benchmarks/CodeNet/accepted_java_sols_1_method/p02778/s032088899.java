import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            sb.append("x");
        }
        
        out.println(sb);
        out.close();
        
    }
}