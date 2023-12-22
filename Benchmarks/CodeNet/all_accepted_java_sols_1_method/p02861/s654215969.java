
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int []x = new int [n];
		int []y = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			x[i]= sc.nextInt();
			y[i]= sc.nextInt();
		}
		
		double sum = 0;
		

		int nn = 1;
		for(int i = 1 ; i <= n ; i++) {
			nn *= i;
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				
				double a = Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j], 2);
				double p= Math.sqrt(a);
				sum += 2 * nn/n * p;
			}
		}
		
		
		
		double ans =  (double) (sum / nn);
		
		
		System.out.println(ans);
		
		
	}

}
