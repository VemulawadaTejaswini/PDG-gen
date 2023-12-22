import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    if (a <= c && c <= b && b <= d) {
      System.out.println(b-c);
    } else if (c <= a && a <= d && d <= b) {
      System.out.println(d-a);
    } else if (a <= c && d <= b) {
      System.out.println(d-c);
    } else if (c <= a && b <= d) {
      System.out.println(b-a);
    }else {
      System.out.println(0);
    }

  }

}
