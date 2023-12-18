import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  static int h;

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    h = Integer.parseInt(sc.nextLine()) + 1;
    int[] a = new int[h];

    int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for (int i = 1; i < h; i++) {
        a[i] = input[i-1];
    }

    buildMaxHeap(a);
    for (int i = 1; i < h; i++) {
      System.out.print(" " + a[i]);
    }

    System.out.println();
  }

  static void buildMaxHeap (int[] a) {
    for (int i = h/2; i >= 1; i--) {
      maxHeapify(a, i);
    }
  }

  static void maxHeapify (int[] a, int i) {
    int leftId = i * 2;
    int rightId = i * 2 + 1;
    int largest = 0;

    if (leftId < h && a[leftId] > a[i]) {
	    largest = leftId;
    } else {
      largest = i;
    }

    if (rightId < h && a[rightId] > a[largest]) {
      largest = rightId;
    }

    if (largest != i) {
      int tmp = a[i];
      a[i] = a[largest];
      a[largest] = tmp;
      maxHeapify(a, largest);
    }
  }
}
