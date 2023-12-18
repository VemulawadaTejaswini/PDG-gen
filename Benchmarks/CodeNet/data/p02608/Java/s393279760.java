import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] results = new int[n + 1];
    
    for (int i = 1; i <= 105; i++) {
      for (int j = 1; j <= 105; j++) {
        for (int k = 1; k <= 105; k++) {
          int multiply = i * (i + j + k) + j * (j + k) + k * k;
          if (multiply == n) {
            results[multiply]++;
          }
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      System.out.println(results[i]);
    }
  }
}
