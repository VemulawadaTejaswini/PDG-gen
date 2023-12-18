import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();

    final int[] A = new int[] {1,3,5,7,8,10,12};
    final int[] B = new int[] {4,6,9,11};
    final int[] C = new int[] {2};
    final int[][] ARRAYS = new int[][] {A, B, C};

    for(int[] array : ARRAYS) {
      if(Arrays.binarySearch(array, x) >= 0) {
        if(Arrays.binarySearch(array, y) >= 0) {
          System.out.println("Yes");
          scanner.close();
          System.exit(0);
        } else {
          System.out.println("No");
          scanner.close();
          System.exit(0);
        }
      }
    }
    System.out.println("No");

    scanner.close();
  }
}
