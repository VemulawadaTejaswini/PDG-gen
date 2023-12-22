import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int X = Integer.parseInt(arr[0]);
        int A = Integer.parseInt(arr[1]);
        out.println(X < A ? 0 : 10);
        out.close();
    }

}
