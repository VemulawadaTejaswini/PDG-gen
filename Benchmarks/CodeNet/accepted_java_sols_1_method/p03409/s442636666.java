import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
    int[] c = new int[n];
    HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
    for(int i = 0; i < n; i++) {
      int b = sc.nextInt();
      a[i] = sc.nextInt();
      map1.put(a[i], b);
    }
    for(int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
      int d = sc.nextInt();
      map2.put(c[i], d);
    }
    Arrays.sort(a);
    Arrays.sort(c);
    int[] used = new int[n];
    int ans = 0;
    for(int i = 0; i < n; i++) {
      for(int j = n - 1; j >= 0; j--) {
        if((c[i] > map1.get(a[j])) && (map2.get(c[i]) > a[j]) && (used[j] == 0)) {
          ans++;
          used[j] = 1;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}