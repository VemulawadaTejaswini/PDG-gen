import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PriorityQueue<Double> pq = new PriorityQueue<>(n);
    for(int i=0;i<n;i++){
      pq.add(sc.nextDouble());
    }
    double te=pq.poll();
    while(!pq.isEmpty()){
      te=(te+pq.poll())/2;
    }
    System.out.println(te);
  }
}