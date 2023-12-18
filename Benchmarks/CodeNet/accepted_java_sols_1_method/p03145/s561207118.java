import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for(int i=0; i<3;i++){
      pq.add(sc.nextInt());
    }

    int min_1;
    int min_2;

    min_1 = pq.poll();
    min_2 = pq.poll();

    System.out.println(min_1*min_2/2);
  }
}