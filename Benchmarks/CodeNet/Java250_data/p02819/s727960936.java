import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
        
		while(!isPrime(x)) {
			x++;
		}
					
		System.out.println(x);
		sc.close();
	}

	private static boolean isPrime(int x) {
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}