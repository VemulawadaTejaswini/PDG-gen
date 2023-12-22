import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long K = scan.nextLong();
		long p = 0;
		
		Queue<Long> que = new ArrayDeque<>();
		
		for(long i=1; i<=9; i++){
			que.add(i);
		}
		
		for(long i=1; i<=K; i++){
			p = que.poll();
			
			if((p%10)!=0){
			que.add(p*10+p%10-1);
			}
			
			que.add(p*10+p%10);
			
			if((p%10)!=9){
			que.add(p*10+p%10+1);
			}
		}
		
		System.out.println(p);
	}
}