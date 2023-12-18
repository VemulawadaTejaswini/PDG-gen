import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int count = selectionSort(A, N);

    printArray(A);
    System.out.println(count);
  }

  public static int selectionSort(int[] a, int n) {
    int count = 0;

    for (int i = 0; i < n; i++) {
      int minj = i;
      for (int j = i; j < n; j++) {
        minj = a[j] < a[minj] ? j : minj;
      }
      if (i != minj) {
        swap(a, i, minj);
        count++;
      }
    }

    return count;
  }

  private static void printArray(int[] a) {
    System.out.println(
      Arrays.stream(a)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" ")));
  }

  public static void swap(int[] a, int n, int m) {
    int tmp = a[n];
    a[n] = a[m];
    a[m] = tmp;
  }
}
