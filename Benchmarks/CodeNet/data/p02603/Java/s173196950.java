import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long yen = 1000;
    long stock = 0;
    int n = sc.nextInt();
    int[] price = new int[n];
    for (int i = 0; i < n; i++) {
      price[i] = sc.nextInt();
    }
    for (int i = 0; i < n - 1; i++) {
      if (price[i] >= price[i + 1]) {
        yen += stock * price[i];
        stock = 0;
      } else {
        stock = yen / price[i];
        yen -= stock * price[i];
      }
    }
    if (stock != 0) {
      yen += stock * price[n - 1];
    }
    System.out.println(yen);
  }
}
