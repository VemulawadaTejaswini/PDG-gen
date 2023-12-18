import java.util.*;
public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int x = input.nextInt();
    int n = input.nextInt();
    
    Set<Integer> set = new HashSet<>();
    int[] a = new int[n];
    boolean notFound = true;
    for (int i = 0; i < n; i++) {
      set.add(input.nextInt());
    }

    int lower = x;
    int higher = x;
    
    while (set.contains(lower)) {
      lower--;
    }
    
    while (set.contains(higher)) {
      higher++;
    }
    
    System.out.println(x - lower <= higher - x ? lower : higher);
  }
}