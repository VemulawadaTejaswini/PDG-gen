import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String ans = "";
    for(int i = 0; i < s.length(); i++) {
      int d = s.charAt(i) - 'A';
      d = (d + n) % 26;
      String c = String.valueOf((char)('A' + d));
      ans += c;
    }
    System.out.println(ans);
  }
}
