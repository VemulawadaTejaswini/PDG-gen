
import java.util.Scanner;

public class Main {

	public static final long MOD = 1_000_000_007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long count1 = 0;
		long count2 = 0;
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (a[i]>a[j]) {
					count1++;
					if (i<j) {
						count2++;
					}
				}
			}
		}
		
		System.out.println(((k*(k-1)/2)%MOD*count1%MOD+count2*k)%MOD);
		
		
		
		
	}



}