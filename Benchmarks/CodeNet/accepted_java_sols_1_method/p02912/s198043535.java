import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      int n = sc.nextInt();
      pq.offer(n);
    }

    for (int i = 0; i < M; i++) {
      if(pq.isEmpty()) break;
      int max = pq.remove();
      max = max /2;
      if(max >0){
        pq.offer(max);
      }
    }
    long ans = 0;
    while(!pq.isEmpty()){
      int n = pq.remove();
      ans += n;
    }

    System.out.println(ans);

   }

}
