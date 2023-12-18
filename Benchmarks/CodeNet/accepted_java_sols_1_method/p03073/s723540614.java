import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] S = in.nextLine().toCharArray();
    int one = 0, zero = 0;
    for (int i = 0; i < S.length; i++) {
      if (i % 2 == 0) {
        if (S[i] == '0') {
          one++;
        } else {
          zero++;
        }
      } else {
        if (S[i] == '1') {
          one++;
        } else {
          zero++;
        }
      }
    }
    System.out.println(Math.min(one, zero));
  }
}