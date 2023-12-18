import java.util.Scanner;

public class Main {
  static int insertionSort(int[] a, int n, int g) {
    int t, j;
    int count = 0;
    for (int i = g; i < n; i++) {
      t = a[i];
      j = i - g;
      while (j >= 0 && a[j] > t) {
        a[j + g] = a[j];
        j -= g;
        count++;
      }
      a[j + g] = t;
    }
    return count;
  }

  static int shellSort(int[] a, int n) {
    int count = 0;
    int g = 1;
    int m = 1;
    while (g < n / 9) {
      g = 3 * g + 1;
      m++;
    }
    System.out.println(m);
    int[] G = new int[m];
    for (int i = 0; i < m; i++) {
      G[i] = g;
      g = g / 3;
      count += insertionSort(a, n, G[i]); 
      System.out.print(G[i]);
      if (i != m - 1) System.out.print(" ");
      else System.out.println();
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = stdIn.nextInt();
    int count = shellSort(a, n);
    System.out.println(count);
    for (int i = 0; i < n; i++)
      System.out.println(a[i]);
  }
}