import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int A1 = scan.nextInt();
    int A2 = scan.nextInt();
    int A3 = scan.nextInt();
    int sum = A1 + A2 + A3;
    System.out.println(sum >= 22 ? "bust" : "win");
  }
}