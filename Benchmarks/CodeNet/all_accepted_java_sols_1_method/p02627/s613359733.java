import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        PrintWriter out = new PrintWriter(osw);
    
        String s = br.readLine();
        char[] alpha = s.toCharArray();
    
        if(Character.isUpperCase(alpha[0])){
            out.println("A");
        }else{
            out.println("a");
        }
        out.close();
        
    }
}
