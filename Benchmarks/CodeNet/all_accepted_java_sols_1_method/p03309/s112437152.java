import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		long sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			a[i] = a[i] - i - 1 ;
		}
		Arrays.sort(a);
		int b = 0;
		
		if(n % 2 == 0) {
			 b = (a[n/2] + a[n/2 - 1])/2;
		}
		if(n % 2 == 1){
			b = a[(n-1)/2];
		}
		long ans = 0;
		for(int i = 0; i < n ; i++) {
			ans += Math.abs(a[i] - b);
		}
		System.out.println(ans);

	}

}
