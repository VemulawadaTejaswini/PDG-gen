import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(sc.next());
    }
    quickSort(array, 0, array.length-1);
    for (int i = 0; i < n - 1; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println(array[n]);
  }
  public static int[] quickSort(int[] array, int left, int right) {
    if(left<=right) {
      int p = array[(left+right)/2];
      int l = left;
      int r = right;
      while(l <= r) {
        while(array[l] < p) l++;
        while(array[r] > p) r--;

        if(l <= r) {
          int tmp = array[l];
          array[l] = array[r];
          array[r] = tmp;
          l++;
          r--;
        }
      }

      quickSort(array, left, r);
      quickSort(array, l, right);
    }
    return array;
  }
}