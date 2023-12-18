import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = Long.parseLong(sc.next());
    Queue<Long> queue = new ArrayDeque<>();
    queue.add(h);
    Long vital;
    Long sum = 0L;
    Long base = 1L;
    while(!queue.isEmpty()){
      vital = queue.poll();
      sum+=base;
      base*=2;
      if(vital>1){
        queue.add(vital/2);
      }
    }
    System.out.print(sum);
    System.out.flush();
  }
}