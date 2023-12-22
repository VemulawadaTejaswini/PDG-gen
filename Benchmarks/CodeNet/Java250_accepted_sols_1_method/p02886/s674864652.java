import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] di = new int[n];
    int sum = 0;

    for (int i = 0; i < n; i++) {
      di[i] = sc.nextInt();
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1+i; j <= n; j++) {
        sum +=di[i-1] * di[j-1];
      }
    }
    System.out.println(sum);
  }
}