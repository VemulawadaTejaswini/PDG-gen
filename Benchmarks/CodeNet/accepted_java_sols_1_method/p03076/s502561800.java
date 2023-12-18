import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int maxRemain = 0;
      int sum = 0;

      for (int i = 0; i < 5; ++i) {
        int dish = in.nextInt();
        int remain = dish % 10 > 0 ? 10 - (dish % 10) : 0;
        maxRemain = Math.max(maxRemain, remain);
        sum += dish + remain;
      }
      
      sum -= maxRemain;
      
      System.out.println(sum);
    }
  }
}