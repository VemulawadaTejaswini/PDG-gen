import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.next();
    int maxProfit = 0;
    int minPrice = -1;
    int count = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (minPrice == -1 || a < minPrice) {
        minPrice = a;
      } else if (a - minPrice > maxProfit) {
        maxProfit = a - minPrice;
        count = 0;
      }
      if (a - minPrice == maxProfit) {
        count += 1;
      }
    }
    sc.close();

    System.out.println(count);
  }
}
