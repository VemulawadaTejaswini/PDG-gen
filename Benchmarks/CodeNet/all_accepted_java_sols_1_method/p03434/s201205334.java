import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    Arrays.sort(a);
    int sum = 0;
    int sign = 1;
    for (int i = n-1; i >= 0; i--) {
      sum += sign * a[i];
      sign *= -1;
    }
    System.out.println(sum);
  }
}
