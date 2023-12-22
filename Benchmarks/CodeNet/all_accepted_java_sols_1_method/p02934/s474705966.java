import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			double[] a = new double[n];
			for(int i = 0 ; i < n ; i++ ) {
				a[i] = sc.nextDouble();
			}
			
			double base = 0;
			for(int i = 0 ; i < n ; i++ ) {
				base += 1f/a[i];
			}
			
			double answer = 1f / base;
			System.out.println(answer);
		}
	}
}
