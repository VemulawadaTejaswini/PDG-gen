import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] likes = new int[M];
    for (int i=0; i<N; i++) {
      int len = sc.nextInt();
      for (int j=0; j<len; j++) {
        likes[sc.nextInt()-1]++;
      }
    }

    int count = 0;
    for (int i=0; i<M; i++) {
      if (likes[i] == N) count++;
    }

    System.out.println(count);

  }
}
