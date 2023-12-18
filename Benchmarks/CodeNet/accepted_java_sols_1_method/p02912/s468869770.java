import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      PriorityQueue pq = new PriorityQueue();
      for(int i = 0;i < n;i++){
        pq.add(-sc.nextInt());
      }
      while(m>0){
      	int k = (int)pq.poll();
        pq.add(k/2);
        m--;
      }
      long sum = 0;
      Iterator<Integer> iterator = pq.iterator();
      while(iterator.hasNext()){
      	sum+=(long)iterator.next();
      }
      System.out.println(-sum);
    }
}
