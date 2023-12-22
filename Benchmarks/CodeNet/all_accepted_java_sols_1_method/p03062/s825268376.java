import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		
		int mincnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] < 0) {
				mincnt++;
			}
		}
		
		long sum = Arrays.stream(a).map(Math::abs).sum();
		
		if(mincnt%2!=0) {
			long min = Arrays.stream(a).map(Math::abs).min().getAsLong();
			
			sum-=min*2;
		}
		System.out.println(sum);

	}

}
