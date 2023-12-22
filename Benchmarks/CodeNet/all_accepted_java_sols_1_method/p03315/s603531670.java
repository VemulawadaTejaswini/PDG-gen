import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] c = str.toCharArray();
    int n = 0;

    for (int i = 0 ; i < 4 ; i++ ) {
      if (c[i] == '+') {
        n = n + 1;
      } else {
        n = n - 1;
      }
    }
    System.out.println(n);
  }
}
