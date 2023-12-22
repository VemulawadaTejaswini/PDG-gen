import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final int price = new PriceReader().read();
    final int balance = new BalanceCalculator().pay(price);
    new BalancePrinter().write(balance);
  }
  
}

class BalanceCalculator {
  private static final int AMOUNT_PER_BILL = 1_000;
  public int pay(int price) {
    int bills = price / AMOUNT_PER_BILL;
    if (bills * AMOUNT_PER_BILL < price) {
      bills++;
    }
    return bills * AMOUNT_PER_BILL - price;
  }
}

class PriceReader {
  public int read() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}

class BalancePrinter {
  public void write(int balance) {
    System.out.println(balance);
  }
}
