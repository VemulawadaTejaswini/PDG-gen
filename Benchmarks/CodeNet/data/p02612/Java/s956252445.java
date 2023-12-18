import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        int n = Integer.parseInt(br.readLine());
         
        out.println(1000 - (n % 1000));
        out.close();
        
    }
}