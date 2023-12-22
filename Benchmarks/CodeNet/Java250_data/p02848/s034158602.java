import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    char[] chars = s.toCharArray();
    char[] ret = new char[chars.length];

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] + n > 'Z') {
        ret[i] = (char) (chars[i] + n - 'Z' + 'A' - 1);
      } else {
        ret[i] = (char) (chars[i] + n);
      }
    }
    StringBuilder result = new StringBuilder();
    for (char c : ret) {
      result.append(c);
    }
    System.out.println(result.toString());
  }
}
