import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < (2 * m); i++) {
      a[sc.nextInt() - 1]++;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }

  }
}