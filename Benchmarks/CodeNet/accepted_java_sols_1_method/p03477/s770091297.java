import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int l = a + b;
    int r = c + d;

    if(l > r) {
      System.out.println("Left");
    } else if(l < r) {
      System.out.println("Right");
    } else {
      System.out.println("Balanced");
    }
  }
}
