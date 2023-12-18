import java.util.*;
import java.math.BigDecimal;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    System.out.println(s.substring(0, 1) + (len - 2) + s.substring(len - 1));
  }
}