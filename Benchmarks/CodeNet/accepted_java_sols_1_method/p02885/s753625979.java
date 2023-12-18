import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int x = 2 * b;

    if(x >= a) {
      System.out.println(0);
    } else {
      System.out.println(a-x);
    }
  }

}
