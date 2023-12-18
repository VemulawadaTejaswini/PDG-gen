import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		int num = stdin.nextInt();
		int yakusuu = 0;
		int primeNum = 1;
		for(int j = 1; j <= num; j++) {
			
			for(int k = 1; k <= j; k++) {
				if(j % 2 == 0)
					break;
				if(j % k == 0) {
					yakusuu++;
				}
				
			}
			
			if(yakusuu == 2) {
				primeNum++;
			}
			yakusuu = 0;
			
		}
		System.out.println(primeNum);
	}
	
}
		
		