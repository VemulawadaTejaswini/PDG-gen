import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] coin = { 500, 100, 50, 10, 5, 1 };
    while (true) {
      int price = sc.nextInt();
      if (price == 0) {
        return;
      }
      int change = 1000 - price;
      int ans = 0;
      for (int i = 0; i < 6; i++) {
        if (change <= 0) {
          break;
        }
        int num = change / coin[i];
        ans += num;
        change = change - num * coin[i];
      }
      System.out.println(ans);
    }
  }
}
