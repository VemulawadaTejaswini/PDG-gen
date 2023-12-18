import java.math.BigDecimal;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    BigDecimal ba = new BigDecimal(a);
    BigDecimal bb = new BigDecimal(b);
    BigDecimal bres = ba.divide(bb);
    System.out.println(a/b + " " + a%b + " " + bres);
  }
}