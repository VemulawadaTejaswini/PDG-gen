import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ans = 1;
    for(int i = 2; i < 50; i++) {
      for(int j = 2; j < 10; j++) {
        if((int)Math.pow(i, j) <= x) ans = Math.max(ans, (int)Math.pow(i, j));
      }
    }
    System.out.println(ans);
  }
}