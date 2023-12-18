import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int M = sc.nextInt();
      	int K = sc.nextInt();
        
      	PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
      	BigInteger total = BigInteger.ZERO;
      	
      	for (int i = 0; i < M + N; i++) {
          	long next = sc.nextLong();
          	if (next > K) {
              continue;
            }
        	maxHeap.offer(next);
          	total = total.add(BigInteger.valueOf(next));
          	if (total.compareTo(BigInteger.valueOf(K)) > 0) {
              long max = maxHeap.poll();
              total = total.subtract(BigInteger.valueOf(max));
            }
        }
      	System.out.println(maxHeap.size());
    }
}
