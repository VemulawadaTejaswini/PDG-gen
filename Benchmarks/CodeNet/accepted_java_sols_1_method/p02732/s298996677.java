import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    int[] a = new int[n];
    
    for (int i = 0; i < n; i++) {
      a[i] = input.nextInt();
      map.merge(a[i], 1, Integer::sum);
    }
    
    long total = 0;
    
    for (int val : map.values()) {
      total += (long)(val) * (val - 1) / 2;
    }
    
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < n; i++) {
      int size = map.get(a[i]);
      long tmp = total - (long)(size) * (size - 1) / 2;
      tmp += (long)(size - 1) * (size - 2) / 2;
      ans.append(tmp).append("\n");
    }
    
    System.out.print(ans);
  }
}