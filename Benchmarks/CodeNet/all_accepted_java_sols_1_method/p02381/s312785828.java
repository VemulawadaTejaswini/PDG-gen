import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] score;
    while (true) {
      n = sc.nextInt();
      if (n == 0)
        break;
      score = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        int s = sc.nextInt();
        score[i] = s;
        sum += s;
      }
      double tmp = 0;
      for (int i = 0; i < n; i++) {
        tmp += ((double)score[i] - (double)sum / n) * ((double)score[i] - (double)sum / n);
      }
      System.out.printf("%.8f\n", Math.sqrt(tmp / n));
    }
  }
}

