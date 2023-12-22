import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str  = sc.next();
    sc.close();
    int one = 0, zero = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '0') {
        zero++;
      } else {
        one++;
      }
    }
    System.out.println(2 * Math.min(one, zero));
  }
}