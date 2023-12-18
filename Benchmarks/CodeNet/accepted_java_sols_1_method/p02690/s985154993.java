
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		for(long i = 0 ; i <= 1000 ;i++) {
			for(long j = -1000 ; j <= 1000 ; j++) {
				long A = (long)Math.pow(i,5);
				long B = (long)Math.pow(j,5);	
				if(A <= B) {
					continue;
				}
				if(A - B == n) {
					System.out.println(i +" "+ j);
					return;
				}
				}
		}
	

	}

}
