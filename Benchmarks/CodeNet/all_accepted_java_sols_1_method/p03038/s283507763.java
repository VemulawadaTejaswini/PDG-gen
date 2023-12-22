import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    List<Integer> A = new ArrayList<>();
    int[][] BC = new int[M][2];

    for (int i = 0; i < N; i++) {
      A.add(sc.nextInt());
    }

    for (int i = 0; i < M; i++) {
      BC[i][0] = sc.nextInt();
      BC[i][1] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(BC, (a,b) -> Integer.compare(b[1],a[1]));

    int count = 0;

    roop:for (int i = 0; i < M; i++) {
      for (int j = 0; j < BC[i][0]; j++) {
        A.add(BC[i][1]);
        count++;
        if (N <= count) {
          break roop;
        }
      }  
    }

    Collections.sort(A, Comparator.reverseOrder());

    long max = 0;

    for (int i = 0; i < N; i++) {
      max += A.get(i);
    }

    System.out.println(max);

  }

}