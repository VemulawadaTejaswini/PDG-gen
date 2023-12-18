import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    int min = 10000;
    for (int i = 0, len = sChars.length - tChars.length + 1, lent = tChars.length; i < len; i++) {
      int count = 0;
      for (int j = 0; j < lent; j++) {
        if (sChars[i + j] != tChars[j]) {
          count++;
        }
      }
      if (count < min) {
        min = count;
      }
    }
    System.out.println(min);
  }
}
