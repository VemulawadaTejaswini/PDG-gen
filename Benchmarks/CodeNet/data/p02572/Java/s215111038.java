import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a[] = new int[n];
		long sum = 0;
		for(int i = 0 ; i < n ; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		int mod = 1000000007;
		sc.close();
		long tmp = 0;
		for(int j = 1 ; j < n ; j ++){
			tmp += a[j];
			tmp %= mod;
		}
		for(int i = 0 ; i < n-1; i++){
			sum += (a[i] * tmp);
			sum %= mod;
			tmp -= a[i+1];
		}
		System.out.println(sum);
	}
}
