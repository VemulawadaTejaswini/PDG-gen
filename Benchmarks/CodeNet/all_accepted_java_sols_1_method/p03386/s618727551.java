import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = sc.nextInt();
    int max = sc.nextInt();
    int range = sc.nextInt();
    Set<Integer> lhs = new LinkedHashSet<Integer>();
    for (int i = min; i < Math.min(min + range, max) ; i++) {
      lhs.add(i);
    }
    for (int i = Math.max(max - range + 1, min); i <= max; i++) {
       lhs.add(i);
    }
    for (Integer num : lhs) {
      System.out.println(num);
    }
  }
}