
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, i = 1, j;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		while(i <= n) {
			if(i % 3 == 0) {
				System.out.printf(" %d", i);
			} else if(i % 10 == 3) {
				System.out.printf(" %d", i);
			} else {
				for(j = 10; j < 100000; j*=10) {
					if(i / j == 3 || i / j % 10 == 3) {
						System.out.printf(" %d", i);
						break;
					}
				}
			}
			
			i++;
			
		}
		System.out.println();
	}

}
