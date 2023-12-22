import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    int count = 0;
    int max = h[0];

    for (int i = 0; i < n; i++) {
      if (max-1 > h[i]) {
        count++;
        continue;
      }
      max = Math.max(max,h[i]);
    }

    // System.out.println(count);

    if (count == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}
