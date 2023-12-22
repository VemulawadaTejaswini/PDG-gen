import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    int[] kai = new int[26];
    for(int i = 0; i < w.length(); i++) {
      int d = w.charAt(i) - 'a';
      kai[d]++;
    } 
    String ans = "Yes";
    for(int i = 0; i < 26; i++) {
      if((kai[i] % 2) == 1) ans = "No";
    }
    System.out.println(ans);
  }
}