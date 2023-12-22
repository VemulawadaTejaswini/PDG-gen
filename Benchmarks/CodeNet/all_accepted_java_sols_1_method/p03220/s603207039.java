
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double T = sc.nextDouble();
    int A = sc.nextInt();
    int ans = 0;//平均気温がA度に最も近い地点
    double min = Double.MAX_VALUE;// ↑の値

    for (int i = 0; i < N; i++) {
      double tmp = T - sc.nextDouble() * 0.006;
      double t = Math.abs(A - tmp);
      if(t < min) {
        ans = i+1;
        min = t;
      }
    }
    System.out.println(ans);
  }
}
