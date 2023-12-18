import java.util.*;
public class Main {
  public static void main(String...args) {
  	final Scanner sc = new Scanner(System.in);
    final int X = sc.nextInt();
    final int Y = sc.nextInt();
    System.out.println(X % Y == 0 ? -1 : X);
  }
}