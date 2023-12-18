import java.util.*;

class Main {
  
  
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
    Deque<Long> que = new ArrayDeque<Long>();
    long count = 0;
    for (long i = 1;i<10; i++){
      que.add(i);
    }
    long temp;
    while (true){
      temp = que.pop();
      count++;
      if (count == x){
        System.out.println(temp);
        return;
      }
      if (temp%10 != 0){
        que.add(10*temp+temp%10-1);
      }
      que.add(10*temp+temp%10);
      if (temp%10 != 9){
        que.add(10*temp+temp%10+1);
      }
    }    
  }
}
