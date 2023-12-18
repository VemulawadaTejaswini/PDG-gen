import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = in.nextLong();
		long[] ans = new long[n];
		for(int i=0;i<n;i++) {
			if(i%2==0) ans[0] += a[i];
			else ans[0] -= a[i];
		}
		System.out.print(ans[0]);
		for(int i=1;i<n;i++) {
			ans[i] = a[i-1]*2 - ans[i-1];
			System.out.print(" "+ans[i]);
		}
		
		in.close();

	}

}
