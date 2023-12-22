import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = (n - 1) / 111;
    a += 1;
    System.out.println(111 * a);
  }
}