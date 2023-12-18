import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        Arrays.sort(arr);
        out.println(arr[0].equals("1") 
                    && arr[1].equals("4")
                    && arr[2].equals("7")
                    && arr[3].equals("9")
                    ? "YES" : "NO");
        out.close();
    }
}
