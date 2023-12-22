import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] c = new int[n];
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = s.nextInt();
    }
    for (int i = 0; i < n; i++) {
      c[i] = s.nextInt();
    }
    int maxV = 0;
    for (int i = 0; i < n; i++) {
      maxV += Math.max(0, v[i] - c[i]);
    }
    System.out.println(maxV);
  }
}
