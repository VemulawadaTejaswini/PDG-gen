import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        long tmp10 = 1;
        long tmp9 = 1;
        long tmp8 = 1;
        long cut = 1000000000 + 7;

        long ans = 0;

        for(int i = 0; i < N; i++) {
            tmp10 = (tmp10 * 10) % cut ;
            tmp9 = (tmp9 * 9) % cut ;
            tmp8 = (tmp8 * 8) % cut ;
        }

        ans = (tmp10 - tmp9 * 2 + tmp8) % cut;

        if(ans < 0) ans += cut;
        
        pw.println(ans);
        br.close();
        pw.close();
    }
}