import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fiveHundred = sc.nextInt();
    int oneHundred = sc.nextInt();
    int fifty = sc.nextInt();
    int price = sc.nextInt();
    int count = 0;
    for (int i = 0; i <= fiveHundred; i++) {
      for (int j = 0; j <= oneHundred; j++) {
        for (int k = 0; k <= fifty; k++) {
          if ((500 * i + 100 * j + 50 * k) == price) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}