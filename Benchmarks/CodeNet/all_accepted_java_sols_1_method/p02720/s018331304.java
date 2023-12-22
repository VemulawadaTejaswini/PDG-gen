import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int n = sc.nextInt();
    LinkedList<Long> que = new LinkedList<>();
    for(long i = 1; i < 10; ++i) {
      que.offer(i);
    }
    long now = 0;
    int count = 9;
    while(count < n) {
      now = que.poll();
      if(now % 10 != 0) {
        que.offer(now * 10 + now % 10 - 1);
        count++;
      }
      que.offer(now * 10 + now % 10);
      count++;
      if(now % 10 != 9) {
        que.offer(now * 10 + now % 10 + 1);
        count++;
      }
    }
    System.out.println(que.get(que.size() - 1 - (count - n)));
  }
}