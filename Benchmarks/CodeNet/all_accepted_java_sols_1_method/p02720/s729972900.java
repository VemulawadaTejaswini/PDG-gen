import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long ans = 0;
    Deque<Long> q = new ArrayDeque<Long>();
    for(int i=1;i<10;i++){
      q.add((long)i);
    }
    int count = 0;
    long x = 0;
    while(true){
      x = q.poll();
      if(x%10!=0){
        q.add(x*10+(x%10)-1);
      }
      q.add(x*10+x%10);
      if(x%10!=9){
        q.add(x*10+x%10+1);
      }
      count += 1;
      if(count==k){
        ans = x;
        break;
      }
    }

    System.out.println(ans);



  }
}