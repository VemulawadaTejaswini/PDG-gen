import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    
    char[] m = s.toCharArray();
    int cnt = m.length;

    int ans = 1;
    for (int i = 0; i < cnt-1; i++) {
      if (m[i] != m[i+1]) ans++;
    }
    
    System.out.println(ans);
  }
}
