import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        String[] s = br.readLine().split(" ");
    
        out.println(s[2] +" "+ s[0] +" "+ s[1]);
        out.close();
        
    }
}