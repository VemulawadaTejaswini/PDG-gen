import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Set<Integer> set = new HashSet<>();
    set.add(in.nextInt());
    set.add(in.nextInt());
    set.add(in.nextInt());
    System.out.println(set.size() == 2 ? "Yes" : "No");
  }
}
