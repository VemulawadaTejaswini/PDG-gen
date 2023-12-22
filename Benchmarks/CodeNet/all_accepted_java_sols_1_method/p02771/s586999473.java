import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> set = new HashSet<>();
    set.add(sc.nextInt());
    set.add(sc.nextInt());
    set.add(sc.nextInt());
    System.out.println((set.size() == 2) ? "Yes" : "No");
  }
}