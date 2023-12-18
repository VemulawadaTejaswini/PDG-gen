import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i = 0; i < N; i++){
      int A = Integer.parseInt(sc.next());
      pq.offer(A);
    }
    
    for(int i = 0; i < M; i++){
      int B = pq.poll();
      pq.offer(B/2);
    }
    
    long ans = 0;
    for(int i = 0; i < N; i++){
      ans += pq.poll();
    }
    
    System.out.println(ans);
  }
}