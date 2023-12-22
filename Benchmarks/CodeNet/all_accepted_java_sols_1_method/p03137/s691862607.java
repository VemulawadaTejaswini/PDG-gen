import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] X = new int[M];

    for (int i = 0; i < M; i++) {
      X[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(X);

    int[] distance = new int[M-1];

    int count = 0;

    for (int i = 0; i < M-1; i++) {

      distance[i] = (int)Math.abs(X[i] - X[i+1]);

    }

    Arrays.sort(distance);

    for (int i = 0; i < M-N; i++) {

      count += distance[i];

    }

    System.out.println(count);

  }

}