import java.util.*;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());
      
      PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0; i<n; i++){
      	q.add(Long.parseLong(sc.next()));
      }
      
      for(int i=0; i<m; i++){
        long tmp = q.poll();
        q.add(tmp/2);
      }
      
      long ans = 0;
      while(!q.isEmpty()){
        ans += q.poll();
      }
      
      System.out.println(ans);
    }
}