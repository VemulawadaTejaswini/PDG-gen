
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		int m = Math.max(a, b);
		int max =Math.max(m, c);
		int maxt = max;
				
		for(int i = 0; i < k; i ++) {
			max *= 2;
		}
		
		result = max + a + b + c - maxt;
		
		System.out.println(result);
	}
}
