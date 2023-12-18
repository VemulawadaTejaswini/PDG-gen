import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		int mod = (int)Math.pow(10.0, 9.0)+7;
		System.out.println(mod);

		long sum = 0;
		for(int i = 0 ; i < n-1; i++){
			for(int j = i+1 ; j < n ; j ++){
				sum += a[i] * a[j] % mod;
				sum %= mod;
				System.out.println(i + ":" + j + "→" + sum);
			}
		}
		System.out.println(sum);
	}
}
