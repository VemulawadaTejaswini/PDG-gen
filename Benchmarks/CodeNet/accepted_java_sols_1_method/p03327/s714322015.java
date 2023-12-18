import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        String result="";
        if(n < 1000) {
            result="ABC";
        } else {
            result = "ABD";
        }
        System.out.println(result);
    }
}
