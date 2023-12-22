import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] S = in.nextLine().toCharArray();
    int zero = 0, one = 0;
    for (char ch : S) {
      if (ch == '0') {
        zero++;
      } else {
        one++;
      }
    }
    System.out.println(Math.min(zero, one) * 2);
  }
}