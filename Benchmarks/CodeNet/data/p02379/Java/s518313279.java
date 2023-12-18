import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigDecimal x1 = sc.nextBigDecimal();
        BigDecimal y1 = sc.nextBigDecimal();
        BigDecimal x2 = sc.nextBigDecimal();
        BigDecimal y2 = sc.nextBigDecimal();
        BigDecimal distance = new BigDecimal(Math.sqrt(Math.pow(Math.abs(x1.doubleValue()-x2.doubleValue()),2) 
                                                     + Math.pow(Math.abs(y1.doubleValue()-y2.doubleValue()),2)));
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(8);
        System.out.println(nf.format(distance));
    }
}