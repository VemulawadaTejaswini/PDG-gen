import java.util.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      if(N<10){
        System.out.println(N);
        return;
    }
    Deque<Long> lll = new ArrayDeque<Long>();
    
    for(int i=1; i < 10; i++){
      lll.add(Long.valueOf(i));
    }
     
    Integer cnt = 9;
    while(cnt < N){
      Long prev = lll.poll();
      Long now = Long.valueOf(0);
      if((prev%10)!=0){
        now = 10*prev + (prev%10) -1;
        lll.add(now);
        cnt++;
      }
      if(cnt==N){
        System.out.println(now);
        return;
      }
      now = 10*prev + (prev%10);
      lll.add(now);
      cnt++;
	  if(cnt==N){
        System.out.println(now);
        return;
      }
      if((prev%10)!=9){
		now = 10*prev + (prev%10) + 1;
        lll.add(now);
        cnt++;
      }
      if(cnt==N){
        System.out.println(now);
        return;
      }
    }
  }
}