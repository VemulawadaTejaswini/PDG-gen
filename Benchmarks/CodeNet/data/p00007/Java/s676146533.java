
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int money = 100000; //返す金額
    int week = Integer.parseInt(reader.readLine());
    int roundingDigit = 1000; //何円に丸めるか
    
    for (int i = 0; i < week; i++) {
      money *= 1.05;
      money = floor(money, roundingDigit);
    }
    System.out.println(money);
  }

  public static int ceil(int n, int digit) {
    return n - (n % digit == 0 ? 0 : n % digit);
  }
  
  public static int floor(int n, int digit) {
    return n + (n % digit == 0 ? 0 : digit - n % digit);
  }
  
}