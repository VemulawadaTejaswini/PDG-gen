import java.util.Scanner;
import java.util.Arrays;

class Main {

  int comparisons = 0;

  public void merge(int[] A, int left, int mid, int right) {
    int n1 = mid - left;
    int n2 = right - mid;
    int[] L = new int[n1+1];
    int[] R = new int[n2+1];
    for (int i = 0; i < n1; i++) {
      L[i] = A[left + i];
    }
    for (int i = 0; i < n2; i++) {
      R[i] = A[mid + i];
    }
    L[n1] = Integer.MAX_VALUE;
    R[n2] = Integer.MAX_VALUE;
    int i = 0;
    int j = 0;
    for (int k = left; k < right; k++) {
      this.comparisons++;
      if (L[i] <= R[j]) {
        A[k] = L[i];
        i = i + 1;
      } else {
        A[k] = R[j];
        j = j + 1;
      }
    }
  }

  public void mergeSort(int[] A, int left, int right) {
    if (left + 1 < right) {
      int mid = (left + right) / 2;
      mergeSort(A, left, mid);
      mergeSort(A, mid, right);
      merge(A, left, mid, right);
    }
  }

  public static void display(int[] A) {
    StringBuilder s = new StringBuilder("");
    for (int i = 0; i < A.length - 1; i++) {
      s.append(A[i] + " ");
    }
    s.append(A[A.length - 1]);
    System.out.println(s);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = s.nextInt();
    }
    Main x = new Main();
    x.mergeSort(A, 0, A.length);
    display(A);
    System.out.println(x.comparisons);
  }
}

