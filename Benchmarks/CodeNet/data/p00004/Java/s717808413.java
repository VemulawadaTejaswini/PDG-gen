import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToke;
        String line;
        // ax + by = c
        // dx + ey = f
        while ((line = in.readLine()) != null) {
            strToke = new StringTokenizer(line);
            double a = Double.parseDouble(strToke.nextToken());
            double b = Double.parseDouble(strToke.nextToken());
            double c = Double.parseDouble(strToke.nextToken());
            double d = Double.parseDouble(strToke.nextToken());
            double e = Double.parseDouble(strToke.nextToken());
            double f = Double.parseDouble(strToke.nextToken());
            BigDecimal y = new BigDecimal((a * f - d * c) / (a * e - d * b)).setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal x = new BigDecimal((c * e - f * b) / (a * e - b * d)).setScale(3, BigDecimal.ROUND_HALF_UP);
            System.out.println(x + " " + y);
        }
    }
}