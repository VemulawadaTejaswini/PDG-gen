import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String cur=sc.nextLine();
      String a=cur.split(" ")[0];
      String b=cur.split(" ")[1];
      BigDecimal c=new BigDecimal(a);
      BigDecimal d=new BigDecimal(b);
      BigDecimal res=c.multiply(d);
      long l=res.setScale( 0, BigDecimal.ROUND_FLOOR ).longValue();
      System.out.println(l);
    }
}