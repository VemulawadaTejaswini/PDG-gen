import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int primes = 0;
		int[] n = new int[1000000];
		for (int i = 2; i < n.length; ++i) {
			
			if (isPrime(i))
				++primes;
			
			n[i] = primes;
		}
		
		while ((input = bf.readLine()) != null) {

			try {
				int num = Integer.parseUnsignedInt(input);
				System.out.print(n[num] + "\n");
			} catch (NumberFormatException nfe) {
				break;
			}
		}
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); div += 1) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}