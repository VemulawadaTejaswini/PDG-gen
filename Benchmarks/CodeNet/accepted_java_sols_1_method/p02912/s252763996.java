import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

    for(int i=0; i<n; i++){
      int a = sc.nextInt();
      pq.add(a);
    }
    //System.out.println(pq);

    for(int i=0; i<m; i++){
      int s = pq.poll();
       s = s/2;
      pq.add(s);
    }
    //System.out.println(pq);
    int si = pq.size();
    long sum = 0;
    for(int i=0; i<si; i++){
      long ll = pq.poll();
      sum += ll;
    }
    System.out.println(sum);

  }

}