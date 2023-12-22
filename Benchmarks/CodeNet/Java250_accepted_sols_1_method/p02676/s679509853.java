import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        if(s.length() > k){
            out.print(s.substring(0, k));
            out.println("...");
        }else{
            out.println(s);
        }
        
        out.close();
        
    }
}