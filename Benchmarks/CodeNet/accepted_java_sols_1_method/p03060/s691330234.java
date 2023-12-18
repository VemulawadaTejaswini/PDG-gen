import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Input
    int n = s.nextInt();
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = s.nextInt();
    }
    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
      c[i] = s.nextInt();
    }

    // Solve
    int maxValue = 0;
    for (int i = 0; i < n; i++) {
      maxValue += Math.max(0, v[i] - c[i]);
    }

    // Output
    System.out.println(maxValue);
  }
}
