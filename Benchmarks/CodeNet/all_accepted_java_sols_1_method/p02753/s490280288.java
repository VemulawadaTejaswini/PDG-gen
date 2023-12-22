import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        String s = br.readLine();
        
        if(s.equals("AAA") || s.equals("BBB")){
            out.println("No");
        }else{
            out.println("Yes");
        }
        out.close();
        
    }
}