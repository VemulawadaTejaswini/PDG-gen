import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      b[i] = 0;
    }

    for (int i = 1; i <= n - 1; i++) {
      b[scan.nextInt() - 1]++;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(b[i]);
    }
  }

}