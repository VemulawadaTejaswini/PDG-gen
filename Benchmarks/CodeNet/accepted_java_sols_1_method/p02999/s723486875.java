import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        
        out.println(x < a ? 0 : 10);
        out.close();
        
    }
}