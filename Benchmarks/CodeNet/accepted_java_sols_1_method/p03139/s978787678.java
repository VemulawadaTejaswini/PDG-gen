import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int A = Integer.parseInt(arr[1]);
        int B = Integer.parseInt(arr[2]);
        out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
        out.close();
    }
}
