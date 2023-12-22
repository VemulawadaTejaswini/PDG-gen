import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      a.add(sc.nextInt());
    }
    Collections.sort(a);
    int cost1 = a.get(1) - a.get(0);
    int cost2 = a.get(2) - a.get(1);
    System.out.println(cost1 + cost2);
  }
}