import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < n; i++) {
      set.add(sc.nextInt());
    }
    String ans = "NO";
    if(set.size() == n) ans = "YES";
    System.out.println(ans);
  }
}