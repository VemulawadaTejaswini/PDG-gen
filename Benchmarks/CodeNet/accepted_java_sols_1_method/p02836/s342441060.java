import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = str.length();
    char[] c = new char[n];
    for(int i = 0; i < n; i++) {
      c[i] = str.charAt(i);
    }
    int ans = 0;
    for(int j = 0; j < n / 2; j++) {
      if(j == n - 1 - j) break;
      if(c[j] != c[n-1-j]) ans++;
    }
    System.out.println(ans);
  }
}
