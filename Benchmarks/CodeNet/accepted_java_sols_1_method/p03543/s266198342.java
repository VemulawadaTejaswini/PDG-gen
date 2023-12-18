import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] N = sc.next().toCharArray();
    int count = 0;
    char prevC = 'a';
    for (char c : N) {
      if (c == prevC) {
        count++;
        if (count >= 3) {
          break;
        }
      } else {
        count = 1;
      }
      prevC = c;
    }
    System.out.println(count >= 3 ? "Yes" : " No");
  }
}