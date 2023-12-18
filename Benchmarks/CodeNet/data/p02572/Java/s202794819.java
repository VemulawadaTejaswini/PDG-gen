import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		long ans = 0;
		int mod = (int)Math.pow(10, 9) + 7;
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextLong();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				ans = (ans + (a[i]*a[j]))%mod;
			}
		}
		System.out.println(ans);
	}

}
