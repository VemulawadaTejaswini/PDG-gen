import java.util.Scanner;

class Queue{
  static int NUM = 100000;
  Process[] a = new Process[NUM];
  int head;
  int tail;

  Queue(){
    head = 0;
    tail = 0;
  }

  void enqueue(Process p){
    if(!this.isFull()){
      a[tail] = p;
      if(tail == NUM - 1)
        tail = 0;
      else
        tail++;
      }
  }

  Process dequeue(){
    if(!this.isEmpty()){
      if(head == NUM - 1)
        head = 0;
      else
        head++;

      if(head == 0)
        return a[NUM - 1];
      else
        return a[head-1];
    }
    else
      return null;
  }

  boolean isFull(){
    return (head == 0 && tail == NUM-1) || (head == tail+1);
  }

  boolean isEmpty(){
    return head == tail;
  }

}

class Process{
  String name;
  int time;
  Process(String name, int time){
    this.name = name;
    this.time = time;
  }
  Process(Process p){
    this.name = p.name;
    this.time = p.time;
  }
}

public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int q = stdIn.nextInt();
    Queue queue = new Queue();

    for(int i = 0; i < n; i++){
      String name = stdIn.next();
      int time = stdIn.nextInt();
      queue.enqueue(new Process(name, time));
    }

    int time_sum = 0;
    while(!queue.isEmpty()){
      Process p = queue.dequeue();
      p.time -= q;
      if(p.time <= 0){
        time_sum += (q + p.time);
        System.out.println(p.name + " " + (time_sum));
      }
      else{
        queue.enqueue(p);
        time_sum += q;
      }
    }

  }
}