import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
	
		String input;
		int datasetCount = 0;
		
		
		Scanner stdin = new Scanner(System.in);
		while (++datasetCount <= 30) {
			int primes = 0;
			input = stdin.nextLine();
			try {
				int n = Integer.parseUnsignedInt(input);
				
				if (n > 999999)
					break;
				
				for (int i = 2; i <= n; ++i) {
					
					if (isPrime(i))
						++primes;
					
				}
				
				System.out.print(primes);
				
				
			} catch (NumberFormatException nfe) {
				break;
			}
		}
		stdin.close();
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); ++div) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}