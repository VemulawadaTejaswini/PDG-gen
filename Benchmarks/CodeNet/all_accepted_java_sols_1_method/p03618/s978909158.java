import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long len = s.length();
    long[] a = new long[26];
    for(int i = 0; i < s.length(); i++) {
      a[s.charAt(i) - 'a']++;
    }
    long ans = (len * (len - 1)) / 2;
    ans++;
    for(int i = 0; i < 26; i++) {
      ans -= ((a[i] * (a[i] - 1)) / 2);
    }
    System.out.println(ans);
  }
}