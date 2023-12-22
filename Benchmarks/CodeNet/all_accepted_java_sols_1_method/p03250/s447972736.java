import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i=0; i<3; i++){
      pq.add(sc.nextInt());

    }

    int a = pq.poll();
    int b = pq.poll();
    int c = pq.poll();

    System.out.println(10*a+b+c);
  }
}
