import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length()-1-i)) {
        count++;
      }
      if (s.length() -i - i < 3) {
        break;
      }
    }
    System.out.println(count);
  }
}
