import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Integer[] A = new Integer[N];

    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
    }
    Arrays.sort(A, Collections.reverseOrder());
    int Alice = 0;
    int Bob = 0;
    for (int i = 0; i < N; i+=2) {
      Alice += A[i];
      if (i+1 < N) {
         Bob += A[i+1];
      }
    }

    System.out.println(Alice-Bob);
  }

}
