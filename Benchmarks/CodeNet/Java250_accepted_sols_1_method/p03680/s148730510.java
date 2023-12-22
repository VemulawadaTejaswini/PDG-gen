import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N + 1];

    for (int i = 1; i < N + 1; i++) {
      a[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;

    boolean valid = true;
    int current = 1;

    while (valid) {

      count++;
      
      current = a[current];

      if (current == 2) {
        valid = false;
      }

      if (count == N) {
        count = 0;
        valid = false;
      }

    }

    if (count == 0) {
      System.out.println(-1);
    } else {
      System.out.println(count);
    }

  }

}