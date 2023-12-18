import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        int a = Integer.parseInt(br.readLine());
         
        out.println(a + a * a + a * a * a);
        out.close();
        
    }
}