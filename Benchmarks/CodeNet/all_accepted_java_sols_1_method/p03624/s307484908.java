import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] c = new int[26];
    for(int i = 0; i < s.length(); i++) {
      c[s.charAt(i) - 'a']++;
    }
    int a = 26;
    for(int i = 0; i < 26; i++) {
      if(c[i] == 0) {
        a = i;
        break;
      }
    }
    String ans = "None";
    if(a < 26) ans = String.valueOf((char)('a' + a)); 
    System.out.println(ans);
  }
}