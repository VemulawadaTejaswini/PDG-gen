import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ax = Math.abs(x-a);
    int bx = Math.abs(x-b);

    if (ax > bx) {
      System.out.println("B");
    } else {
      System.out.println("A");
    }

  }

}
