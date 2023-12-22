import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    
    int ans = 0;
    for (char c : s) {
      if (c == '1') {
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}