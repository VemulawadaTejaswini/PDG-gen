import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
      	double c = a * b;
		BigDecimal bd = new BigDecimal(String.valueOf(c));
		
		BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
      	long r = Long.parseLong(bd1.toPlainString());
        System.out.println(r);
    }
}