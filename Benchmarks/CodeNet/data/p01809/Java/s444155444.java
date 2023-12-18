import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int p = sc.nextInt();
		int q = sc.nextInt();
		calc((long)p, (long)q);
	}
	public void calc(long p, long q){
		long a = q;
		long b = p;
		long max = 0;
		while(true){
			long c = a % b;
			if(c == 0){
				max = b;
				break;
			}
			else{
				a = b;
				
				b = c;
			}
		}
		p = p / max;
		q = q / max;
		long ans = -1;
		
		for(int i = 2; i < q+1; i++){
			if(q%i == 0){
				long p1 = p;
				long q1 = q;
				long count = 0;
				while(q1%i == 0){
					count++;
					q1 = q1/i;
				}
				long x = q1;
				
				if(x < i && i%x == 0){
					long y = 1;
					if(x != 1) {
						y = i/x;
						count++;
					}
					p1 = p1*y;
					for(int j = 0; j < count; j++){
						p1 = p1 - (p1%i);
						p1 = p1 / i;
					}
					
					if(p1 == 0){
						ans = i;
					}
				}
			}
			if(ans != -1){
				break;
			}
		}
		System.out.println(ans);
		
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}