//Volume1-0134
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//declare
		long n,num,sum = 0;
		
		//input
		Scanner sc = new Scanner(System.in);
		num = n = sc.nextLong();
		while(n-- > 0){
			
			//calculate
			sum += sc.nextLong();
		}
		
		//output
		System.out.println(sum / num);
	}
}