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
        int nearPrice = N % 1000 == 0 ? N / 1000 : N / 1000 + 1;
        int result = 1000 * nearPrice - N;
        pw.println(result);
        br.close();
        pw.close();
    }
}