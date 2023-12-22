import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] v = new int[n];
    int sum = 0;

    for (int i = 0; i < n; ++i) {
      v[i] = sc.nextInt();
    }

    for (int i = 0; i < n; ++i) {
      int c = sc.nextInt();
      sum = (v[i] > c) ? sum + v[i] - c : sum;
    }

    System.out.println(sum);
  }
}