import java.util.Scanner;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  private static int N;
  private static int[] a;

  private static void print() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < N; i++) {
      result.append(a[i]);
      result.append(" ");
    }
    System.out.println(result.toString().trim());
  }

  private static void sort() {
    int swapped = 0;
    if (N == 1) {
      print();
      System.out.println(swapped);
      return;
    }

    for (int i = 0; i < N; i++) {
      int minIndex = i;
      for (int j = i; j < N; j++) {
        if (a[j] < a[minIndex]) {
          minIndex = j;
        }
      }
      // swap
      if (minIndex != i) {
        int tmp = a[minIndex];
        a[minIndex] = a[i];
        a[i] = tmp;
        swapped++;
      }
    }
    print();
    System.out.println(swapped);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }

    // sort a.
    sort();
    // a is now sorted.


  }
}