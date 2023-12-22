import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
          double x = Double.parseDouble(s.next());
          double money = 100;
          int count = 0;
      	while(x > money) {
          money *= 1.01;
          money = Math.floor(money);
          count++;
        }

      	System.out.println(count);
    }
}