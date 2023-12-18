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
    int g = 0;
    int m = 0;
    for (int g_tmp = 1; g_tmp < n / 9; g_tmp += 3 * g_tmp + 1) {
      m++;
      g = g_tmp;
    }
    if (n < 10) {
      m = 1;
      g = 1;
    }
    System.out.println(m);
    int[] G = new int[m];
    G[0] = g;
    for (int i = 1; i < m; i++) {
      G[i] = (G[i - 1] - 1) / 3;
    }
    for (int i = 0; i < m; i++) 
      count += insertionSort(a, n, G[i]);    
    for (int i = 0; i < m; i++) {
      System.out.print(G[i]);
      if (i != m - 1) System.out.print(' ');
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