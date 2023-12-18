import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    Scanner scan=new Scanner(System.in);
    Queue<Process> queue=new ArrayDeque<>();
    List<Process> list=new ArrayList<>();
    int n=Integer.parseInt(scan.next());
    int q=Integer.parseInt(scan.next());
    int t=0;

    for(int i=0;i<n;i++){
      String name=scan.next();
      int time=Integer.parseInt(scan.next());
      queue.add(new Process(name,time));
    }

    while(!queue.isEmpty()){
      Process buf=queue.poll();
      if(buf.time-q<=0){
        buf.time+=t;
        t+=q;
        list.add(buf);
      }else{
        buf.time-=q;
        t+=q;
        queue.add(buf);
      }
    }

    System.out.println();
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i).name+" "+list.get(i).time);
    }
  }
}
class Process{
  public String name;
  public int time;

  public Process(String n,int t){
    name=n;
    time=t;
  }
}
