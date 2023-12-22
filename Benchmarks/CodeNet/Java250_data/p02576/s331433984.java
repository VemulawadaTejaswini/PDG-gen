import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    int count = 0;
    while (true) {
      if (x * count >= n) {
        break;
      }
      count++;
    }
    System.out.println(count * t);
  }
}
