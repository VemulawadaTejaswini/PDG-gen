import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Queue<Long> q = new ArrayDeque<>();
		for(long i = 1; i <= 9; i++) {
			q.add(i);
		}
		for(int i = 0; i < k-1; i++) {
			long temp = q.poll();
			long a = temp%10;
			if(a!= 0) {
				long b = temp*10+a-1;
				q.add(b);
			}
			long b = temp*10+a;
			q.add(b);
			if(a!=9) {
				long c = temp*10+a+1;
				q.add(c);
			}
			//System.out.println(temp);
		}
		System.out.println(q.poll());
	 }
}