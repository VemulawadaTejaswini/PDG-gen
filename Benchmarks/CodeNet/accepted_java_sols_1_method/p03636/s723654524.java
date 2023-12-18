import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char[] c = line.toCharArray();
        int n = c.length-2;
        System.out.println(c[0] + "" + n + "" + c[c.length-1]);
    }    
}
