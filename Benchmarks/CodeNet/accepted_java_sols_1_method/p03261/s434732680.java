import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] w = new String[n];
    HashSet<String> hs = new HashSet<String>();
    for(int i = 0; i < n; i++) {
      w[i] = sc.next();
      hs.add(w[i]);
    }
    String ans = "Yes";
    if(hs.size() != n) ans = "No";
    for(int i = 1; i < n; i++) {
      char s = w[i - 1].charAt(w[i - 1].length() - 1);
      char t = w[i].charAt(0);
      if(s != t) ans = "No";
    }
    System.out.println(ans);
  }
}