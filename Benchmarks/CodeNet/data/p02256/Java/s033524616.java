import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = Math.max(a, b);
    int y = Math.min(a, b);
    x %= y;
    int max = 0;
    for(int i = 1; i < Math.min(x, y) + 1; i++) {
      if(x % i == 0 && y % i == 0) {
        max = i;
      }
    }
    System.out.println(max);
  }
}

