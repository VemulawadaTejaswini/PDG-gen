import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    final int x = sc.nextInt();
    final int[] l = new int[n];
    int dist = 0;
    for (int i = 0; i < n; ++i) {
      l[i] = sc.nextInt();
      dist += l[i];
      if (dist > x) {
        System.out.println(i + 1);
        return;
      }
    }
    System.out.println(n + 1);
  }
}
