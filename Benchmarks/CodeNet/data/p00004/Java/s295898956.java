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
            double a = Integer.parseInt(strToke.nextToken());
            double b = Integer.parseInt(strToke.nextToken());
            double c = Integer.parseInt(strToke.nextToken());
            double d = Integer.parseInt(strToke.nextToken());
            double e = Integer.parseInt(strToke.nextToken());
            double f = Integer.parseInt(strToke.nextToken());
            BigDecimal y = new BigDecimal((a * f - d * c) / (a * e - d * b)).setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal x = new BigDecimal((c * d - f * a) / (b * d - a * e)).setScale(3, BigDecimal.ROUND_HALF_UP);
            System.out.println(x + " " + y);
        }
    }
}