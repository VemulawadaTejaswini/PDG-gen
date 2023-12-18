import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int datasetNum = 3;
		int yakusuu = 0;
		int primeNumber = 0;

		for(int i = 0; i < datasetNum; i++) {
			Scanner stdin = new Scanner(System.in);
			int number = stdin.nextInt();
			for(int j = 1; j <= number; j++) {
				
				for(int k = 1; k <= j; k++) {
					if(j % k == 0) {
						
						yakusuu++;
					}
				}
				
				if(yakusuu == 2) {
					primeNumber++;	
				}
				yakusuu = 0;
			}
			
			System.out.println(primeNumber);
			primeNumber = 0;
			
		}
		
		
	}
}