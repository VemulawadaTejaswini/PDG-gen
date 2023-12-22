import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.next();
    Set<String> set = new HashSet<>();
    while (sc.hasNext()) {
      if (!set.add(sc.next())) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}