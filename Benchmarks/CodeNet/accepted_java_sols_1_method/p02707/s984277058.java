import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] res = new int[n];

    for (int i = 0; i < n; i++) {
      res[i] = 0;
    }

    for (int i = 1; i < n; i++) {
      int a = sc.nextInt();
      res[a - 1]++;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(res[i]);
    }
  }
}
