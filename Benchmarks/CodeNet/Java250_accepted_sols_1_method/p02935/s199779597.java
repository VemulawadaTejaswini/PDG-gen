import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] v = new double[n];
    for(int i = 0; i < n; i++) {
      v[i] = sc.nextDouble();
    }
    Arrays.sort(v);
    double ans = (v[0] + v[1]) / (double)2;
    for(int i = 2; i < n; i++) {
      ans = (ans + v[i]) / (double)2;
    }
    System.out.println(ans);
  }
}