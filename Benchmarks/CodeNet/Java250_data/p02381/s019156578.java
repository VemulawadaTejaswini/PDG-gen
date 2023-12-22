import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    double m, a2;
    while ((n = sc.nextInt()) != 0) {
      m = 0;
      a2 = 0;
      int s[] = new int[n];
      for (int i = 0; i < n; i++) {
        s[i] = sc.nextInt();
        m += s[i];
      }
      m /= n;
      for (int i = 0; i < n; i++) {
        a2 += (s[i] - m) * (s[i] - m);
      }
      a2 /= n;
      System.out.printf("%f\n", Math.sqrt(a2));
    }
  }
}

