import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    double sum = 0;
    double[] x = new double[n];
    double[] y = new double[n];
    for(int i = 0; i < n; i++) {
      x[i] = Double.parseDouble(sc.next());
      y[i] = Double.parseDouble(sc.next());
    }
    for(int i = 0; i < n - 1; i++) {
      for(int j = i + 1; j < n; j++) {
        sum += Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
      }
    }
    double ans = sum * 2 / n;
    System.out.println(ans);
  }
}
