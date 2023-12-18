import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;
public class Main {
  public static void main(String[] args){
    new Main().run();
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    BigDecimal A = new BigDecimal(sc.next());
    BigDecimal B = new BigDecimal(sc.next().replace(".", ""));
    BigDecimal mul = A.multiply(B);
    String ans = A.multiply(B).toPlainString();
    if (mul.compareTo(new BigDecimal(100)) < 0) {
      ans = "0";
    }
    int len = ans.length();
    if (2 < len) {
      ans = ans.substring(0, ans.length() - 2);
    }
    System.out.println(ans);
  }
}
