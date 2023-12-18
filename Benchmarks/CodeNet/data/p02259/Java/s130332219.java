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
    bubbleSort(A, N);
  }

  static void bubbleSort(int[] A, int N) {
    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = N - 1; j >= i + 1; j--) {
        if (A[j - 1] > A[j]) {
          swap(A, j - 1 , j);
          count++;
        }
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
