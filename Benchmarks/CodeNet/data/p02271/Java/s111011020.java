import java.util.*;

public class Main {
  public static boolean solve(int i, int m, List<Integer> list) {
    if(m == 0) {
      return true;
    } else if(i >= list.size()) {
      return false;
    } else {
      return (solve(i + 1, m, list)) || (solve(i + 1, m - list.get(i), list));
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      int m = sc.nextInt();
      if(solve(0, m, arr)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}

