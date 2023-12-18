import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long k  = sc.nextLong();
		long count = 1;
		long m = 7 % k;

		if(k % 2 == 0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		
		while(true) {
			if(m == 0) break;
			
			m *= 10;
			m += 7;
			m %= k;
			count++;
		}
		
		System.out.println(count);
		sc.close();
	}
	
}


