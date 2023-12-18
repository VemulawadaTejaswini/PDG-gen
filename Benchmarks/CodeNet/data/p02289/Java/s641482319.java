import java.util.*;
//import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(11, Collections.reverseOrder());
    Scanner sc = new Scanner(System.in);
    String com = sc.next();
    while(!com.equals("end")){
      switch(com){
        case "insert":
          int n = sc.nextInt();
          pq.add(n);
          break;
        case "extract":
          System.out.println(pq.poll());
          break;
        default:
          break;
      }
      com = sc.next();
    } 
  }   
}
