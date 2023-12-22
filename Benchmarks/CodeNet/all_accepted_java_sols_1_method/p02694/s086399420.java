import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long money = 100;
    long goal = sc.nextLong();
    int count = 0;
    while (money < goal) {
      money += money / 100;
      count++;
    }
    System.out.println(count);
  }
}
