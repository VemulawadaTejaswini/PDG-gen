import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        int x = 0;
        if (N <= 111) {
            x = 111;
        } else if (N <= 222) {
            x = 222;
        } else if (N <= 333) {
            x = 333;
        } else if (N <= 444) {
            x = 444;
        } else if (N <= 555) {
            x = 555;
        } else if (N <= 666) {
            x = 666;
        } else if (N <= 777) {
            x = 777;
        } else if (N <= 888) {
            x = 888;
        } else {
            x = 999;
        }
        out.println(x);
        out.close();
    }
}