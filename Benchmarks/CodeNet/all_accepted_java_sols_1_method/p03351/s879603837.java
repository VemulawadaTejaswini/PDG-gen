import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int x = Math.abs(a-b);
    int y = Math.abs(b-c);
    int z = Math.abs(a-c);

    if (x <= d && y <= d || z <= d) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }




  }
}
