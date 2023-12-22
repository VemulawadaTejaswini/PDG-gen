import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int y = sc.nextInt();

    int s1 = -1;
    int s2 = -1;
    int s3 = -1;
    
    LABEL: for (int i = 0; i <= n; i++) {
      int x1 = n - i;
      for (int j = 0; j <= x1; j++) {
        int k = x1 - j;
        int sum = 1000 * i + 5000 * j + 10000 * k;
        if (sum == y) {
          s3 = i;
          s2 = j;
          s1 = k;
          break LABEL;
        }
      }
    }
    
    System.out.println(s1 + " " + s2 + " " + s3);
  }
}