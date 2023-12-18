import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Prime {
	
	public static void main(String[] args) throws IOException {
	
		
		
		String input;
		int datasetCount = 0;
		
		
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); div += 1) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}