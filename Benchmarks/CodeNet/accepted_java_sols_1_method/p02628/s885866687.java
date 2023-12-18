import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in =new Scanner(System.in);
		int n=in.nextInt(),k=in.nextInt();
			
		int[] a = new int[n];
			
		for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		int sum = 0;
		for(int i = 0;i<k;i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);
		
	}

}
