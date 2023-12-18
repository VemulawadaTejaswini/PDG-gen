import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();

    int ans = -1;
    for (int i = 0; i <= 1000; i++) {
      int t8 = (int) (i * 0.08d);
      int t10 = (int) (i * 0.1d);
      if (t8 == A && t10 == B) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}