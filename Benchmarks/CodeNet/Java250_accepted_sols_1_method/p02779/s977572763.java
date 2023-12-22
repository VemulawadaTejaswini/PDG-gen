import java.util.*;
import java.util.PriorityQueue;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    boolean flag=true;
    PriorityQueue in=new PriorityQueue();
    for(int x=0; x<num; x++){
      int input=scan.nextInt();
      in.offer(input);
    }
    int before=(int)in.poll();
    int after;
    for(int x=1; x<num; x++){
      after=(int)in.poll();
      if(before==after){
        flag=false;
        break;
      }else{
        before=after;
      }
    }
    if(flag){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}