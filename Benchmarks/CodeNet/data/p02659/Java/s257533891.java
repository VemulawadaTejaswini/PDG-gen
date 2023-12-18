import java.util.*;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
      	double B = sc.nextDouble();
      	BigDecimal A2 = new BigDecimal(Long.toString(A));
      	BigDecimal B2 = new BigDecimal(Double.toString(B));
      	BigDecimal value = A2.multiply(B2);
      	BigDecimal ans = value.setScale(0, BigDecimal.ROUND_DOWN);
      	//String str = Double.toString(ans2);
      	System.out.println(ans);
    }
}