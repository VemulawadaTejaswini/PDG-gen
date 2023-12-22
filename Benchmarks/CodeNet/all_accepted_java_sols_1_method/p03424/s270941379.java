import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<String> hashset = new HashSet<String>();
    for (int i=0; i<N; i++) {
      hashset.add(sc.next());
    }
    if (hashset.size() == 3) {
      System.out.println("Three");
    } else {
      System.out.println("Four");
    }
  }
}