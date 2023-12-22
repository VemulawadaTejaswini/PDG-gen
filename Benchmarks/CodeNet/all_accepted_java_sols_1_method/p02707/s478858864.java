import java.util.*;
public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int[] p = new int[n + 1];
    
    Map<Integer, Integer> tree = new HashMap<>();
    
    for (int i = 2; i <= n; i++) {
      tree.merge(input.nextInt(), 1, Integer::sum);
    }
    
    for (int i = 1; i <= n; i++) {
      System.out.println(tree.getOrDefault(i, 0));
    }
  }
}