import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if ((i + 1) % 2 == 0 || a % 2 == 0) continue;
      count++;
    }
    System.out.println(count);
  }
}
