import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    sc.close();
    selectionSort(A, N);
  }

  static void selectionSort(int[] A, int N) {
    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      int minj = i;
      for (int j = i; j < N ; j++) {
        if (A[j] < A[minj])
          minj = j;
      }
      if (i != minj) {
        swap(A, i, minj);
        count++;
      }
    }
    printArray(A);
    System.out.println(count);
  }

  static void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
  }

  static void printArray(int[] A) {
    int n = A.length;
    for (int i = 0; i < n - 1; i++) {
      System.out.printf("%d ", A[i]);
    }
    System.out.print(A[n - 1] + "\n");
  }
}
