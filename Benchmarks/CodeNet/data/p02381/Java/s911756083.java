import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n;
    double[] s;
    while ((n = reader.nextInt()) != 0) {
      s = new double[n];
      double sum = 0;
      for (int i = 0; i < n; i++) {
        s[i] = reader.nextDouble();
        sum += s[i];
      }
      double m = sum / n;

      double sumA = 0;
      for (int i = 0; i < n; i++) {
        sumA += Math.pow(s[i] - m, 2);
      }
      sumA /= n;
      double Alpha = Math.sqrt(sumA);
      System.out.println(Alpha);
    }
  }
}