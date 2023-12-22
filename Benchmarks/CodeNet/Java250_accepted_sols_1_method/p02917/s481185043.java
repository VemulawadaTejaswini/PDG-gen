import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] B = new int[N];

    for(int i = 1; i < N; i++) {
      B[i] = sc.nextInt();
    }

    sc.close();

    int[] A = new int[N+1];

    A[1] = B[1];

    for (int i = 1; i < N; i++) {
      if (B[i] < A[i]) {
        A[i] = B[i];
      }
      A[i + 1] = B[i];
    }

    int max = 0;

    for (int i = 1; i <= N; i++) {
      max += A[i];
    }

    System.out.println(max);

  }

}