import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer[] l = new Integer[N];

    for (int i = 0; i < N; i++) {
      l[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(l, Comparator.reverseOrder());

    Integer length = 0;

    for (int i = 0; i < K; i++) {
      length += l[i];
    }

    System.out.println(length);

  }

}