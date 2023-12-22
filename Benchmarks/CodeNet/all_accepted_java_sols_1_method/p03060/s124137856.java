import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] V = new int[N];
    int[] C = new int[N];

    for (int i = 0; i < N; i++) {
      V[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      C[i] = sc.nextInt();
    }

    sc.close();

    int[] R = new int[N];

    for (int i = 0; i < N; i++) {
      R[i] = V[i] - C[i];
    }

    int sum = 0;

    for (int i = 0; i < N; i++) {
      if (0 < R[i]) {
        sum += R[i];
      }
    }

    System.out.println(sum);

  }

}