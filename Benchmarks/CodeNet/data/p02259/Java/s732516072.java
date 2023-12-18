import java.util.Scanner;

class BubbleSort {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();

    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    int cnt = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          cnt++;
          int t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }

    System.out.print(a[0]);
    for (int i = 1; i < n; i++)
      System.out.print(" " + a[i]);
    System.out.println();
    System.out.println(cnt);
  }
}