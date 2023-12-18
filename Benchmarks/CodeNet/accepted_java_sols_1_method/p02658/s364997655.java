import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    long max = 1;
    for (int i = 0; i < 18; i++) {
      max *= 10;
    }
    // 1000000000000000000
    // 9223372036854775807 System.out.println(Long.MAX_VALUE);
    int n = sc.nextInt();
    long[] list = new long[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextLong();
    }
    sc.close();

    // 昇順で並び替え
    Arrays.sort(list);

    // ０がいればいくらかけても０
    if (list[0] == 0) {
      System.out.println(0);
      return;
    }

    long a = 1;
    for (int i = n - 1; i >= 0; i--) {
      long temp = a * list[i];
      if ( temp > max || temp < a) {
        System.out.println(-1);
        return;
      }
      a = temp;

    }

    System.out.println(a);
  }
}
