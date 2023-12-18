import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == 'g') {
        count += 1;
      } else {
        count -= 1;
      }
    }
    System.out.println(count / 2);
  }
}
