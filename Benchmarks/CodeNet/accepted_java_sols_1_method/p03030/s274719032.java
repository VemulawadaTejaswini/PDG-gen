import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String[] d = new String[n];
    
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      int p = sc.nextInt();
      d[i] = s + ":" + (1100 - p) + ":" + (i + 1);
    }

    Arrays.sort(d);

    for (int i = 0; i < n; i++) {
      String[] ans = d[i].split(":");
      System.out.println(ans[2]);
    }
  }
}
