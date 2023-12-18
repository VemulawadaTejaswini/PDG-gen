
import java.util.Scanner;


public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] b = new int[n+1];
		b[0]=999999;
		b[n]=999999;
		
		for (int i=1;i<n;i++) {
			b[i]=sc.nextInt();
		}
		
		int sum = 0;
		for (int i=0;i<n;i++) {
			sum+=Math.min(b[i], b[i+1]);
		}
		
		System.out.println(sum);
	}
}