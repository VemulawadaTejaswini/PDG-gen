import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Queue<Double> pq = new PriorityQueue<>();
    for(int i = 0; i < N; i++){
      pq.add(Double.parseDouble(sc.next()));
    }
    
    while(pq.size() > 1){
      double a = pq.poll();
      double b = pq.poll();
      pq.add((a+b)/2);
    }
    
    System.out.println(pq.poll());
  }
}