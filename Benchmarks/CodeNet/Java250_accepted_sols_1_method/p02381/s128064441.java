import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in); int j = 0;

    double[] ans = new double[1000];
    while (true) {
       int n = stdIn.nextInt();
       if (n == 0) break;
    int[] s = new int[n];
    double m=0;
    for (int i = 0; i < n; i++) {
      s[i] = stdIn.nextInt();
      m += s[i];
    }
    if (m != 0)
    m /= n;
    else 
    m = 0;
    double sd=0;
    for (int i = 0; i < n; i++) {
      sd += (s[i] - m) * (s[i] - m);
    } sd = Math.sqrt(sd/n);
      ans[j++] = sd;
    }

    for(int i = 0; i < j; i++)
      System.out.printf("%.8f\n", ans[i]);
   
  }
}
