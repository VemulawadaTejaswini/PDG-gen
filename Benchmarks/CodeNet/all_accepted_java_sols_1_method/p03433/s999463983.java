import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();

    int x = n % 500;

    if (x <= a) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}
