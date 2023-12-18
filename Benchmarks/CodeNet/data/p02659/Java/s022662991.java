import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        
        BigDecimal A_big = new BigDecimal(A);
        BigDecimal B_big = new BigDecimal(B);

        BigDecimal ans = (A_big.multiply(B_big)).setScale(0, RoundingMode.DOWN);

        pw.println(ans.toPlainString());
        br.close();
        pw.close();
    }
}