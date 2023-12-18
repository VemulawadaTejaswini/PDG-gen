import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close(); 
    
    int count = 0;

    while (0 < N) {
      N = N - K;
      if (0 < N) {
        N = N + 1;
      }
      count++;
    }

    System.out.println(count);

  }

}