import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      char[] s = sc.next().toCharArray();
      int y = 700;
      if (s[0] == 'o')
        y += 100;
      if (s[1] == 'o')
        y += 100;
      if (s[2] == 'o')
        y += 100;

      System.out.println(y);
    }
  }
}
