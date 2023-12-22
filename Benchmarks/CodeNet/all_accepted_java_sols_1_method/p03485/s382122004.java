import java.util.*;
public class Main {
  public static void main  (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ret = (a + b) / 2;
    if ((a + b) % 2 != 0) {
      ret ++;
    }
    System.out.println(ret);
  }
}