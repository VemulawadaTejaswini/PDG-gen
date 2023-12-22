import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    double p = 0;

    for (int i = 1; i <= n; ++i)
      p += (1 / (double) n) * Math.pow(0.5, Math.max(0, Math.ceil(log((double) k / i))));
    
    System.out.println(p);
  }

  public static double log(double x) {
    return Math.log(x) / Math.log(2);
  }
}