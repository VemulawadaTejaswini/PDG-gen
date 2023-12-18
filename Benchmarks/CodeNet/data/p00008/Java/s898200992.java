import java.util.*;
import static java.lang.System.out;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0008();
	}
	
	void AOJ0008(){	//Sum of 4 Integers
		while(sc.hasNext()){
			int ans=0, n=sc.nextInt();
			for(int a=0; a<10; a++){
				for(int b=0; b<10; b++){
					for(int c=0; c<10; c++){
						for(int d=0; d<10; d++){
							if((a+b+c+d)==n)	ans++;
						}
					}
				}
			}
			out.println(ans);
		}
	}
	
	void AOJ0055(){	// Sequence
		while(sc.hasNext()){
			double last=sc.nextDouble(), ans=last;
			for(int i=2; i<=10; i++){
				ans+= i%2==0? last*2: last/3;
				last = i%2==0? last*2: last/3;
				// out.println(last);
			}
			out.println(ans);
		}
	}
}