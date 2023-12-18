import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }

    int[] x_org = x.clone();
    Arrays.sort(x);

    int m1 = x[(n - 1) / 2];
    int m2 = x[(n + 1) / 2];

    String[] b = new String[n];
    if (m1 == m2) {
      for (int i = 0; i < n; i++) {
        b[i] = String.valueOf(m1);
      }
    } else {
      for (int i = 0; i < n; i++) {
        if (x_org[i] <= m1) {
          b[i] = String.valueOf(m2);
        } else {
          b[i] = String.valueOf(m1);
        }
      }
    }

    System.out.println(String.join("\n", b));
  }
}
