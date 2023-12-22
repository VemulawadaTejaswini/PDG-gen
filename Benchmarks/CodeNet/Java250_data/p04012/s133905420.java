import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    
    int[] a = new int[26];
    for (int i = 0; i < w.length(); i++) {
      a[w.charAt(i)-'a']++;
    }
    
    boolean ans = true;
    for (int i = 0; i < 26; i++) {
      if (a[i]%2 != 0) {
        ans = false;
        break;
      }
    }
    
    System.out.println(ans ? "Yes" : "No");
  }
}