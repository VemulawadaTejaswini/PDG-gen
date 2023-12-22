import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c1 = s.toCharArray();
    for(int i = 0; i < s.length(); i++) {
      int r = c1[i] - 'A';
      r = (r + n) % 26;
      c1[i] = (char)('A' + r);
    }
    System.out.println(new String(c1));
  }
}