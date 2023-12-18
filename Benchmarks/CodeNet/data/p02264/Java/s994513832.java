import java.util.*;

class Main {

  static int LENGTH = 100000;
  static int [] queue = new int[LENGTH];
  static String [] name = new String[LENGTH];
  static int tail = 0;
  static int head = 0;
  public static void main(String args[]){
    //宣言
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = sc.nextInt();
    int out;
    int count=0;
    //input
    for(int i = 0; i<n; i++){
      name[i] = sc.next();
      queue[i] = sc.nextInt();
      tail++;
    }
    //loop
    while(isEmpty() != true){
      out = dequeue();
      if((out-max)>0){
        enqueue(out-max);//
        count += max;
      }else{
        count += out;
        System.out.println(name[head-1]+" "+count);
      }
    }
  }
  //enqueue
  static void enqueue(int num){
    queue[tail] = num;
    if(head != 0){
    name[tail] = name[head-1];//
  }else{
    name[tail] = name[LENGTH-1];
  }
    if(tail == LENGTH-1){
      tail=0;
    }else{
      tail++;
    }
  }
  //dequeue
  static int dequeue(){
    if(head == LENGTH-1){
      head = 0;
      return queue[LENGTH-1];
    }
    return queue[head++];
  }
  //キューの中身がなくなったかどうかの判定
  static boolean isEmpty(){
    return head == tail;
  }

}
