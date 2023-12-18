import java.util.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      BigDecimal b1 = new BigDecimal(a);
      BigDecimal b2 = new BigDecimal(b);
      BigDecimal c = b1.multiply(b2);
      String d1 = c.toString();
      int d = Integer.parseInt(d1); 
        System.out.println(d);
    }
}
