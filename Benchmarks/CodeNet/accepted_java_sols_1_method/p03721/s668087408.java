import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		long[] number = new long[100010];
		for(int i = 0 ; i < n ; i++) number[a[i]] += b[i];
		for(int i = 0 ; i < 100010 ; i++) {
			k -= number[i];
			if(k <= 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
