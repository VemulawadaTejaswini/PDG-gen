
import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(), X = scan.nextInt();
		int min = Integer.MAX_VALUE , total=0;
		
		for(int i=0; i<N; i++) {
			int curr = scan.nextInt();
			if(curr < min) {
				min = curr;
			}
			total = total + curr;
		}
		
		System.out.println((int)((X-total)/min)+N);
		
	}

}
