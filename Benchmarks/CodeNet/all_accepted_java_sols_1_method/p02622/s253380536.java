import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        String t = br.readLine();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                count++;
            }
        }
        
        out.println(count);
        out.close();
        
    }
}