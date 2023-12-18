import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = scan.nextInt();
			a[i] = scan.nextInt();
		}
		long[] Tdp = new long[n+1];
		long[] Adp = new long[n+1];
		long T = 0;
		long A = 0;
		Tdp[0] = 1;
		Adp[0] = 1;
		for (int i = 0; i < n; i++) {
			if ((Tdp[i]%t[i])==0) {
				T = Tdp[i]/t[i];
			} else {
				T = (Tdp[i]/t[i])+1;
			}
			if ((Adp[i]%a[i])==0) {
				A = Adp[i]/a[i];
			} else {
				A = (Adp[i]/a[i])+1;
			}
			long x = Math.max(T, A);
			Tdp[i+1] = t[i]*x;
			Adp[i+1] = a[i]*x;
		}
		System.out.println(Tdp[n]+Adp[n]);
	}
}
