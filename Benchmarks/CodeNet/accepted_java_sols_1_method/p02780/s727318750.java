import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    double[] num = new double[n];
    int start = 0;
    double res = 0;
    for(int i = 0; i < k; ++i) {
      double cur = sc.nextDouble();
      num[i] = (1 + cur) / 2;
      res += num[i];
    }
    double mid = res;
    for(int i = k; i < n; ++i, ++start) {
      double cur = sc.nextDouble();
      num[i] = (1 + cur) / 2;
      mid = mid + num[i] - num[start];
      if( mid - res > (double)1e-6) res = mid;
    }
    System.out.println(res);
  }
}