import java.util.*;
public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int m = input.nextInt();
    
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    
    for (int i = 0; i < n; i++) {
      queue.offer(input.nextInt());
    }
    
    while (m-- != 0 && !queue.isEmpty()) {
    	int max = queue.poll();
      	if (max / 2 != 0) {
          queue.offer(max / 2);
        }
    }
    
    long ans = 0;
    while (!queue.isEmpty()) {
      ans += queue.poll();
    }
    
    System.out.println(ans);
  }
}