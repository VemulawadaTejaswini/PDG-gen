import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] c = str.toCharArray();
    int n = c.length;
    int count = 0 ;

    for (int i = 0 ; i < n/2 ; i++ ) {
      if (c[i] != c[n-1-i]) {
        count++;

      }
    }
    System.out.println(count);
  }
}
