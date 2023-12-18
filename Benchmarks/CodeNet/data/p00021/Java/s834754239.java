import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Math{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                MathContext mc = new MathContext(10);
                BigDecimal x1 = new BigDecimal(st.nextToken());
                BigDecimal y1 = new BigDecimal(st.nextToken());
                BigDecimal x2 = new BigDecimal(st.nextToken());
                BigDecimal y2 = new BigDecimal(st.nextToken());
                BigDecimal x3 = new BigDecimal(st.nextToken());
                BigDecimal y3 = new BigDecimal(st.nextToken());
                BigDecimal x4 = new BigDecimal(st.nextToken());
                BigDecimal y4 = new BigDecimal(st.nextToken());
                BigDecimal a1 = y2.subtract(y1);
                BigDecimal b1 = x1.subtract(x2);
                BigDecimal a2 = y4.subtract(y3);
                BigDecimal b2 = x3.subtract(x4);
                if (a1.multiply(b2, mc) == a2.multiply(b1, mc)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}