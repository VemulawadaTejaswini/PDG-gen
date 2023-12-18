import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Main{
	
	public static void main(String[] args) {
	
		File inFile = new File(args[0]);
		Scanner datasets;
		try {
			datasets = new Scanner(inFile);
			
			
			String input;
			int datasetCount = 0;
			
			while (datasets.hasNextLine()) {
//		for (int dataset = 0; dataset < a.length; ++dataset) {
				
				int primes = 0;
				input = datasets.nextLine();
				try {
					int n = Integer.parseUnsignedInt(input);
					
					if (n > 999999)
						continue;
					
					for (int i = 2; i <= n; ++i) {
						
						if (isPrime(i))
							++primes;
						
					}
					
					System.out.print(primes + "\n");
					
					
				} catch (NumberFormatException nfe) {
					break;
				}
				if (++datasetCount >= 30) {
					return;
				}
			}
			datasets.close();
		} catch (FileNotFoundException e) {
			System.out.print("not found");
		}
	}
	
	
	private static boolean isPrime(int i) {
	
		for (int div = 2; div <= Math.sqrt(i); ++div) {
			if (i % div == 0)
				return false;
		}
		return true;
	}
}