import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		try(Scanner scan = new Scanner(System.in)){
			//本数
			int n = scan.nextInt();
			//セットX
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sumX = 0;
			//セットY
			int c = scan.nextInt();
			int d = scan.nextInt();
			int sumY = 0;
			
			for(int i=0; i<n; i+=a) {
				sumX += b;
			}
			
			for(int i=0; i<n; i+=c) {
				sumY += d;
			}
			
			System.out.println(Math.min(sumX, sumY));
		}
	}
}
