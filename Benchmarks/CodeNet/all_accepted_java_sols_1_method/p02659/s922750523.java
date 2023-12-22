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

        BigDecimal A_big = new BigDecimal(st.nextToken());
        BigDecimal B_big = new BigDecimal(st.nextToken());

        BigDecimal ans = (A_big.multiply(B_big)).setScale(0, RoundingMode.DOWN);
        // BigDecimal ans_d = (A_big.multiply(B_big));

        pw.println(ans.toPlainString());
        // pw.println(ans_d.toPlainString());
        br.close();
        pw.close();
    }
}