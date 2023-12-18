//Volume1-0134
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//declare
		long num = 0,
		     sum = 0;
		
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			
			//calculate
			sum += sc.nextInt();
			num++;
		}
		
		//output
		System.out.println(sum / num);
	}
}