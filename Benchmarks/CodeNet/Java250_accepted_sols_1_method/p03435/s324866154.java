import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[][] c = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = sc.nextInt();
      }
    }

    int[] a = new int[3];
    a[0] = 0;
    int[] b = { c[0][0], c[0][1], c[0][2] };
    a[1] = c[1][0] - b[0];
    a[2] = c[2][0] - b[0];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if ((a[i] + b[j]) != c[i][j]) {
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");

  }
}