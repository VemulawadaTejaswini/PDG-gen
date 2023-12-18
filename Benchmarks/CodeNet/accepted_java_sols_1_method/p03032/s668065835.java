import java.util.*;
public class Main {
 

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] deque = new int[n];
      for(int i = 0; i < n; i++)
        deque[i] = sc.nextInt();

      int maxSum = 0;

      for(int i = 0; i <= Math.min(k, n); i++) {
        for(int j = 0; j + i <= Math.min(k, n); j++) {
          int curSum = 0;
          PriorityQueue<Integer> minHeap = new PriorityQueue<>();
          for(int a = 0; a < i; a++){
            curSum += deque[a];
            minHeap.offer(deque[a]);
          }
          for(int b = 0; b < j; b++){
            curSum += deque[n - 1 - b];
            minHeap.offer(deque[n - 1 - b]);
          }
          int restK = k - i - j;
          while(!minHeap.isEmpty() && minHeap.peek() < 0 && restK > 0) {
            curSum -= minHeap.poll();
            restK--;
          }
          maxSum = Math.max(maxSum, curSum);
        }
      }

      System.out.println(maxSum);
  }

}