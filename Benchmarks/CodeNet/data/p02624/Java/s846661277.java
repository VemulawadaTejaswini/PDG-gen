import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = Integer.parseInt(br.readLine());
            int[] fr = new int[n+1];
            for(int i=1 ; i<=n ; i++) {
                for(int j=i ; j<=n ; j+=i) {
                    fr[j]++;
                }
            }

            long ans = 0;
            for(int i=1 ; i<=n ; i++) {
                ans += (long)i*fr[i];
            }

            pw.println(ans);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
