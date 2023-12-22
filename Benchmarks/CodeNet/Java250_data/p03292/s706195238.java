import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int[] A = new int[3];
      for (int i = 0; i < 3; i++) {
        A[i] = sc.nextInt();
      }
      Arrays.sort(A);
      int result = 0;
      for (int i = 1; i < 3; i++) {
        result = result + Math.abs(A[i-1]-A[i]);
      }

      System.out.println(result);
    }
  }
}
