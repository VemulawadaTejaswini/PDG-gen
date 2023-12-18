import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (i % 2 == 0) {
        if (chars[i] != 'R' && chars[i] != 'U' && chars[i] != 'D') {
          System.out.println("No");
          return;
        }
      } else {
        if (chars[i] != 'L' && chars[i] != 'U' && chars[i] != 'D') {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}
