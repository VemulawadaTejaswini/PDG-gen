import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    int[] v = new int[count];
    int[] c = new int[count];

    for (int i = 0; i < count; i++ ) {
      v[i] = sc.nextInt();
    }

    for (int i = 0; i < count; i++) {
        c[i] = sc.nextInt();
    }

    int result = 0;
    for (int i = 0; i < count; i++) {
      if (v[i] > c[i]) {
        result += v[i] - c[i];
      }
    }

    System.out.println(result);
  }
}
