import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int A = Integer.parseInt(arr[1]);
        int B = Integer.parseInt(arr[2]);
        ans = Math.min(N * A, B);

        out.println(ans);
        out.close();
    }
}
