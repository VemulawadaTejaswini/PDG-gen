import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = x-a+b;

    if (k > x) {
      if (b-a > x) {
        System.out.println("dangerous");
        return;
      }
      System.out.println("safe");
    } else {
      System.out.println("delicious");
    }
  }

}
