import java.util.*; 
import java.lang.*; 
 
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
 
		long N = scan.nextLong();
		long sum = 0;
 
		for(long i=1; i<=N; i++){
			if(!(i%3==0) && !(i%5==0) ){
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
	}
}