import java.util.*;
import java.math.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int S=sc.nextInt();
    BigDecimal bd = new BigDecimal((double)S/3);
    bd = bd.setScale(8, RoundingMode.HALF_UP);
    BigDecimal s = bd.multiply(bd);
    BigDecimal v = s.multiply(bd);
    v = v.setScale(8, RoundingMode.HALF_UP);
    System.out.println(v);
  }
}