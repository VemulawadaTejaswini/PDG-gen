import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    s[6-1] = ' ';
    s[14-1] = ' ';
    System.out.println(new String(s));
  }
}