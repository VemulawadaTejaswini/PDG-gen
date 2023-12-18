
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] data= new int[n];
		for(int i = 0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		
		long prev = 0;
		long prod = 1;
		for(int i = 0; i<n;i++) {
			prod *= data[i];
			if(i == k-1) prev = prod;
			if(i >= k) {
				prod /= data[i-k];
				if(prod > prev) 
					System.out.println("Yes");
				else 
					System.out.println("No");
				prev = prod;
			}
		}
	}
}