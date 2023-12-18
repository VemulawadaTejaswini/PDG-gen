
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		
		
		double result = 0;
		
		for(int i = 1; i <= n; i++) {
			int times = 0;
			double start = i;
			
			while (start < k) {
				start *= 2;
				times++;
			}
//			System.out.println(times);
			
			result += 1.0/n*Math.pow(0.5, times);
		}
		
		System.out.printf("%.10f\n", result);
	}

}
