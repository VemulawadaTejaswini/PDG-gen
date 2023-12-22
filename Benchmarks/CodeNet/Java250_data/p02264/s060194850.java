import java.util.Scanner;
import java.lang.Math;
import java.lang.System;
import java.io.*;
class Process{
  String n;
  int t;
}
class Main{
  private static int max = 100005;
  private static int head, tail;
  private static Process[] q=new Process[max];

  public static void initialize(){
    head = 0;
    tail = 0;
    return;
  }

  public static boolean isEmpty(){
    return head==tail;
  }

  public static boolean isFull(){
    return ((tail+1)%max==head);
  }

  public static void enqueue(String n, int t){
    if(isFull()) System.out.println("Error");
    q[tail]=new Process();
    q[tail].n=n;
    q[tail].t=t;
    //System.out.println(tail);
    tail=(tail+1)%max;
    //System.out.println(tail);
  }

  public static Process dequeue(){
    if(isEmpty()) System.out.println("Error");
    int x=head;
    head=(head+1)%max;
    return q[x];
  }

  public static void main(String args[]) throws Exception{
    Scanner stdIn=new Scanner(System.in);
    int namecnt=stdIn.nextInt();
    int quantum=stdIn.nextInt();
    int total=0;

    // InputStreamReader isr=new InputStreamReader(System.in);
    // BufferedReader br=new BufferedReader(isr);
    String line;
    for(int i=0;i<namecnt;i++){
      String n=stdIn.next();
      int t=stdIn.nextInt();
      enqueue(n,t);
      //String[] str=line.split(" ");
      // enqueue(str[0],Integer.parseInt(str[1]));

      //System.out.println(line);
  }

    while(!isEmpty()){
      Process temp=new Process();
      temp=dequeue();
      //System.out.println(temp.n+temp.t);
      if(temp.t>quantum){
        temp.t-=quantum;
        enqueue(temp.n,temp.t);
        total+=quantum;
      }
      else{
        total+=temp.t;
        System.out.println(temp.n+" "+total);
      }
    }
  }
}


