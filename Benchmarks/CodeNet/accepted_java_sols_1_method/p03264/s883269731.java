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
            int k = K / 2;
            out.println(k * k);
        } else {
            int k = (K + 1) / 2;
            out.println(k * (k - 1));
        }      
        out.close();
    }
}