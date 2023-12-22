import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;

    boolean valid = true;

    while (valid) {

      count++;

      for (int i = 0; i < N; i++) {
        if (A[i] % 2 == 0) {
          A[i] = A[i] / 2;
        } else {
          count--;
          valid = false;
          break;
        }
      }

    }
    
    System.out.println(count);

  }

}