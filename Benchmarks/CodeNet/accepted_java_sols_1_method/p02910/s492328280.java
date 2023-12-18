import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] dances = s.toCharArray();

    boolean y = false;
    for (int i = 1; i <= dances.length; i++) {
      if (i % 2 == 0) {
        y = dances[i-1] == 'L' || dances[i-1] == 'U' || dances[i-1] == 'D';
        if (!y) {
          System.out.println("No");
          return;
        }
      } else {
        y = dances[i-1] == 'R' || dances[i-1] == 'U' || dances[i-1] == 'D';
        if (!y) {
          System.out.println("No");
          return;
        }
      }
    }
    if (y) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
