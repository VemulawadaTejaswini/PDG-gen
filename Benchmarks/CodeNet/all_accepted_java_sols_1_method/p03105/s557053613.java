import java.util.Scanner;
import java.util.PriorityQueue;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    PriorityQueue pq = new PriorityQueue();
    int A = sc.nextInt();
    pq.add(sc.nextInt()/A);
    pq.add(sc.nextInt());
    System.out.println(pq.poll());
  }
}