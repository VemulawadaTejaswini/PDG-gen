import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] T = new int[N];
    
    for (int i = 0; i < N; i++) {
      T[i] = sc.nextInt();
    }

    int M = sc.nextInt();
    int[] P = new int[M];
    int[] X = new int[M];

    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt() - 1;
      X[i] = sc.nextInt();
    }

    sc.close();

    for (int i = 0; i < M; i++) {
      int time = 0;
      for (int j = 0; j < N; j++) {
        if (P[i] == j) {
          time += X[i];
        } else {
          time += T[j];
        }
      }
      System.out.println(time);
    }

  }

}