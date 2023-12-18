import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            line = br.readLine();
            st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            BigDecimal bdA = new BigDecimal(a);
            BigDecimal bdB = new BigDecimal(b);

            sb.append(a).append(" ").append(b).append(" ").append(bdA.divide(bdB,5,RoundingMode.HALF_EVEN));
            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}