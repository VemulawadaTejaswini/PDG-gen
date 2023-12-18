import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        double average = (double)L/3;
        out.println(BigDecimal.valueOf(average * average * average).toPlainString());
        out.flush();
        out.close();
        br.close();
    }
}