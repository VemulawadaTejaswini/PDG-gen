import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int tot = Integer.parseInt(br.readLine());
        int max = Math.max(n, m);
        int ans = tot/max;
        tot %= max;
        if(tot != 0) ans++;
        pw.println(ans);




        pw.flush();
        pw.close();
    }
}
