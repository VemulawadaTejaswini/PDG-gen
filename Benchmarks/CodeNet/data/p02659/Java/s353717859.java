import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;
public class Main {
  public static void main(String[] args){
    new Main().run();
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    String ans = BigDecimal.valueOf(A * B).toPlainString();
    System.out.println(ans.replaceFirst("\\..*$", ""));
  }
}
