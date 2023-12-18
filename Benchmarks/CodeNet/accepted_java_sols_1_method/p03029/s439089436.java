import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(arr[0]);
        int P = Integer.parseInt(arr[1]);
        out.println((A * 3 + P) / 2);
        out.close();
    }
}
