import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] a = s.toCharArray();
    int n = a.length;

    int m = 0;
    for (int i = 0; i < n-1; i++) {
      if (a[i] != a[i+1]) m++;
    }

    System.out.println(m);
  }
}
