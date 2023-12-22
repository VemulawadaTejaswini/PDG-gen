import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt(); 
		
		double num[] = new double[n];
		
		for(int i = 0; i < n ; i++){
			num[i] = ((scan.nextDouble()+1)/2);
		}
		

		double exp[] = new double[n];
		exp[0] = num[0];
		
		for(int i = 1; i < n ; i++){
			exp[i] = (exp[i-1] + num[i]);
		}
		
		double max = exp[k - 1];
		double sum = 0;
		
		for(int i = 1; i < n - k + 1; i++){
			sum = exp[i + k - 1]-exp[i-1];
			if(max <= sum)max = sum;
		}
		
		System.out.println(max);
		
	}
}