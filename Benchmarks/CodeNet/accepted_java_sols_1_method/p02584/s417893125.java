import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        if(X < 0) X = X*-1;

        long quotient = X / D;
        long mod = X % D;

        long result = 0;

        if(quotient > K) {
            result = mod + D * (quotient - K);
        } else {
            if((K - quotient) % 2 == 0) {
                result = mod;
            } else {
                result = mod - D;
            }
        }

        pw.println(Math.abs(result));
        br.close();
        pw.close();
    }
}