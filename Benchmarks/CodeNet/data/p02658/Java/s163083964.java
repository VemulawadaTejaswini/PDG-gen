import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
  	public static final BigDecimal max = BigDecimal.valueOf(Math.pow(10,18));

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        sc.nextInt();
      	BigDecimal result = BigDecimal.ONE;
        while (sc.hasNext()) {
          BigDecimal next = new BigDecimal(sc.next());
          result = result.multiply(next);
        }
        if (result.compareTo(max) > 0) {
            System.out.println("-1");
        } else {
          System.out.println(Sresult.toString());
        }
    }
}
