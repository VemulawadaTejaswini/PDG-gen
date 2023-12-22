import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int X = Integer.parseInt(arr[1]);
        String[] arr2 = br.readLine().split(" ");

        int D = 0;
        int ans = 1;
        for (int i = 0; i < N; i++) {
            D += Integer.parseInt(arr2[i]);
            if (D > X) {
                break;
            }
            ans++;
        }
        out.println(ans);
        out.close();
    }
}
