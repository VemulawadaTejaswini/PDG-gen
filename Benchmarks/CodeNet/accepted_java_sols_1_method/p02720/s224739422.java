import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    int count = 0;
    long ans = 0;

    Deque<Long> q = new ArrayDeque<Long>();

    for (int i = 1; i <= 9; i++) {
      q.add((long)i);
    }

    while (true) {
      ans = q.poll();
      if (ans%10!=0) {
        q.add(ans*10+ans%10-1);
      }
      q.add(ans*10+ans%10);
      if (ans%10!=9) {
        q.add(ans*10+ans%10+1);
      }
      count++;

      if (count == k) {
        break;
      }

    }

    System.out.println(ans);
    
  }

}
