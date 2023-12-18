import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			final int n = Integer.parseInt(reader.readLine());
			final int[] list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(reader.readLine());
			}
			reader.close();
			
			int count = 0;
			for (int num : list) {
				if (isPrime(num)) count++;
			}
			
			System.out.println(String.valueOf(count));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean isPrime(final int num) {
		boolean isPrime;
		
		if (num < 2) {
			isPrime = false;
			
		} else if (num == 2) {
			isPrime = true;
			
		} else if (num % 2 == 0) { 
			isPrime = false;
			
		} else {
			isPrime = true;
			
			final int end = (int)Math.pow(num, 0.5);
			for (int i = 3; i <= end; i += 2) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}