import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int K = Integer.parseInt(br.readLine());
        if (K % 2 == 0) {
            out.println(K / 2 * K / 2);
        } else {
            out.println((K + 1) / 2  * ((K + 1) / 2 - 1));
        }      
        out.close();
    }
}