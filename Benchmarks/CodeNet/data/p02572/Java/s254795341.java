import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum = (long) ((sum+a[i])%(Math.pow(10, 9)+7));
		}
		long ans = 0;
		long temp = 0;
		for(int i = 0; i < n; i++) {
			temp += a[i];
			long t = (long) ((a[i]*(sum-temp))%(Math.pow(10, 9)+7));
			ans+=(t%(Math.pow(10, 9)+7));
		}
		System.out.println((long)(ans%(Math.pow(10, 9)+7)));
	}
}