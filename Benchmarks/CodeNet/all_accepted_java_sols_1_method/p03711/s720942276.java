import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = 1, b = 2, c = 3;

    if(x == 2) {
      x = a;
    } else if(x == 4 || x == 6 || x == 9 || x == 11) {
      x = b;
    } else {
      x = c;
    }
    if(y == 2) {
      y = a;
    } else if(y == 4 || y == 6 || y == 9 || y == 11) {
      y = b;
    } else {
      y = c;
    }

    if(x == y) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
