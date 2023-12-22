import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    for(int i = 1; i < n; i++) {
      if(s.charAt(i) != s.charAt(i - 1)) list.add(i);
    }
    int ans = 0;
    for(int i = 0; i < list.size(); i++) {
      int t = list.get(i);
      if(s.charAt(t) == '0') {
        if((i + (2 * k)) < list.size()) {
          int s1 = list.get(i + (2 * k));
          ans = Math.max(ans, s1 - t);
        } else {
          ans = Math.max(ans, n - t);
        }
      } else {
        if((i + (2 * k) + 1) < list.size()) {
          int s1 = list.get(i + (2 * k) + 1);
          ans = Math.max(ans, s1 - t);
        } else {
          ans = Math.max(ans, n - t);
        }        
      }
    }
    System.out.println(ans);
  }
}