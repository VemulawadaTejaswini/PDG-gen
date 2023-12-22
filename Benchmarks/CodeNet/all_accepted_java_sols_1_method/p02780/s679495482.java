import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n  = Integer.parseInt(sc.next());
		int k  = Integer.parseInt(sc.next());
		double[] pi = new double[n]; 


		double sum = 0l;
		for(int i = 0 ; i < n ; i++) {
			double tmp = Double.parseDouble(sc.next());
			pi[i] = (tmp+1)/2;
			
			if(i < k) {
				sum +=  pi[i];
			}

		}

		double max = sum;
		for(int i = k ; i < n ; i++) {
			sum = sum - pi[i-k] + pi[i];
			
			if(max < sum) {
				max = sum;
			}
		}
		
		System.out.println(max);

	}



}