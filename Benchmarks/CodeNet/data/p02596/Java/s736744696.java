import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());

        int mod = 0;

        for (int i = 0; i < K; i++) {
            int target = mod * 10 + 7;

            if(target % K == 0) {
                pw.println(i + 1);
                br.close();
                pw.close();
                return;
            } else {
                mod = target % K;
            }
        }
        
        pw.println(-1);
        br.close();
        pw.close();
    }
}