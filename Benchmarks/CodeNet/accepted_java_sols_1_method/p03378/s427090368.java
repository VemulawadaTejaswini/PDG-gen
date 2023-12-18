import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();

    int[] A = new int[N];

    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;

    for (int i = 0; i < M; i++) {

      if (A[i] < X) {
        count++;
      }

    }

    if (count < M/2) {
      System.out.println(count);
    } else {
      System.out.println(M - count);
    }

  }

}