import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int sum = 0;
    int maxWaiting = 0;
    
    for (int i = 0; i < 5; i++) {
      int time = s.nextInt();
      int timeUplift = (time / 10) * 10 + (time % 10 > 0 ? 10 : 0);
      sum += timeUplift;
      maxWaiting = Math.max(maxWaiting, timeUplift - time);
    }
    System.out.println(sum - maxWaiting);
  }
}
