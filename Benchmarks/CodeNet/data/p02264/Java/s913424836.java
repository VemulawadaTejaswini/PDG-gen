import java.util.Scanner;

class Queue{
  Process[] a = new Process[10000];
  int head;
  int tail;

  Queue(){
    head = 0;
    tail = 0;
  }

  void enqueue(Process p){
    if(tail == a.length)
      tail = 0;
    a[tail++] = p;
  }

  Process dequeue(){
    if(head == a.length)
      head = 0;
    return a[head++];
  }

  boolean isFull(){
    if(head == (tail+1) % a.length)
      return true;
    else
      return false;
  }

  boolean isEmpty(){
    if(head == tail)
      return true;
    else
      return false;
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