import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    float total = 0;
    for (int i = 0; i < count ; i++ ) {

      float money = sc.nextFloat();
      String type = sc.next();

      if (type.equals("JPY")) {
        total += money;
      } else if (type.equals("BTC")) {
        float bit = 380000.0f;
        total += money * bit;
      }
    }

    System.out.println(total);
  }
}
