import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int u500 =0, u5 =0;
    u500 = X / 500 * 1000;
    u5 = X % 500 / 5 * 5;
    System.out.println(u500 + u5);
  }
}