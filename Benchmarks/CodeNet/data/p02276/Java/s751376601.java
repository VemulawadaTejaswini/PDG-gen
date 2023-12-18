import java.util.Scanner;
public class Main {

  public static int partition(int[] a, int p, int r) {
    int x = a[r];
    int i = p - 1;
    for (int j = p; j < r; j++) {
      if (a[j] <= x) {
        i++;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
    int temp = a[i+1];
    a[i+1] = a[r];
    a[r] = temp;
    return i+1;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = s.nextInt();
    }
    s.close();
    int result = partition(A, 0, n-1);
    for (int i = 0; i < n; i++) {
      if (i == result)
        System.out.print("[");
      System.out.print(A[i]);
      if (i == result)
        System.out.print("]");
      if (i != n-1)
        System.out.print(" ");
    }
    System.out.println();
  }
}
