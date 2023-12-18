import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigDecimal X = new BigDecimal(st.nextToken());
        BigDecimal K = new BigDecimal(st.nextToken());
        BigDecimal D = new BigDecimal(st.nextToken());

        for(int i = 0; i < K.intValue(); i++) {
            if(X.compareTo(BigDecimal.valueOf(0)) == 1 && D.compareTo(BigDecimal.valueOf(0)) == 1 ) {
                X = X.subtract(D);
            } else if(X.compareTo(BigDecimal.valueOf(0)) == 1 && D.compareTo(BigDecimal.valueOf(0)) == -1) {
                X = X.add(D);
            } else if(X.compareTo(BigDecimal.valueOf(0)) == -1 && D.compareTo(BigDecimal.valueOf(0)) == 1) {
                X = X.add(D);
            } else if(X.compareTo(BigDecimal.valueOf(0)) == -1 && D.compareTo(BigDecimal.valueOf(0)) == -1) {
                X = X.subtract(D);
            } else {
                X = X.add(D);
            }
        }

        pw.println(X.abs());
        br.close();
        pw.close();
    }
}