import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		double sum = 0;
		if(n < k) {
			sum = get(n, k);
		} else {
			sum = (n - k + 1) + get(k - 1, k);
		}
		
		sum *= (1.0 / (n * 1.0));
		System.out.println(sum);
	}
	
	public static double get(int n, int k) {
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			int p = (int)Math.ceil(Math.log10((k * 1.0) / i) / Math.log10(2));
			sum += Math.pow(0.5, (p * 1.0));
		}
		return sum;
	}
}
