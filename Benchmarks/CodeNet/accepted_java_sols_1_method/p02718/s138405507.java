import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			double m = sc.nextDouble();
			
			double[] aArray = new double[n];
			
			int total = 0;
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextDouble();
				total += aArray[i];
			}
			
			double th = total / (4*m);
			int count = 0;
			for(int i = 0 ; i < n ; i++ ) {
				if ( aArray[i] >= th) {
					count++;
				}
			}
			
			if ( count >= m ) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
	}

}