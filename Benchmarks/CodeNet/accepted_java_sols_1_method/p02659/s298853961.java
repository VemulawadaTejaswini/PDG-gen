import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String inp=sc.nextLine();
      String[] ip = inp.split(" ");
      String a = ip[0];
      String b = ip[1];
      BigDecimal c = new BigDecimal(a);
      BigDecimal d = new BigDecimal(b);
      BigDecimal res = c.multiply(d);
      long ans = res.setScale(0, BigDecimal.ROUND_FLOOR).longValue();
      System.out.println(ans);
    }
}