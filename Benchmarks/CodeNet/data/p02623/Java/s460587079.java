import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int M = sc.nextInt();
      	int K = sc.nextInt();
        
      	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
      	long total = 0;
      	
      	for (int i = 0; i < M + N; i++) {
          	int next = sc.nextInt();
        	maxHeap.offer(next);
          	total += next;
          	if (total > K) {
              int max = maxHeap.poll();
              total -= max;
            }
        }
      	System.out.println(maxHeap.size());
    }
}
