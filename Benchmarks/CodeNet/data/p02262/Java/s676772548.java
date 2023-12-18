import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    List<Integer> g = new ArrayList<>();
    int x = 1;
    do {
      g.add(0, x);
      x = 3 * x + 1;
    } while(x < n / 9);
    int count = 0;
    for(int i = 0; i < g.size(); i++) {
      for(int j = g.get(i); j < n - 1; j++) {
        int v = a[j];
        int k = j - g.get(i);
        while(k >= 0 && v < a[k]) {
          a[k + g.get(i)] = a[k];
          k -= g.get(i);
          count++;
        }
        a[k + g.get(i)] = v;
      }
    }
    System.out.println(g.size());
    for(int i = 0; i < g.size(); i++) {
      if(i == g.size() - 1) {
        System.out.println(g.get(i));
      } else {
        System.out.print(g.get(i) + " ");
      }
    }
    System.out.println(count);
    for(int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}

