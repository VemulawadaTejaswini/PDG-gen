import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    int heaps[] = new int[n];
    Arrays.fill(heaps, 1);
    int res = 0;
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = list.get(a-1);
      int d = list.get(b-1);
      if (c >= d) heaps[b-1] = 0;
      if (c <= d) heaps[a-1] = 0;
    }
    for (int i: heaps) {
      res += i;
    }
    System.out.println(res);
    sc.close();
  }
}