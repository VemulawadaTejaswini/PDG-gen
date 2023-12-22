import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		long c1 = 0;
		long c2 = 0;
		long sign = 1;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
			if(sum * sign <= 0) {
				c1 += Math.abs(sum) + 1;
				sum = sign;
			}
			sign *= -1;
		}
		sign = -1;
		sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
			if(sum * sign <= 0) {
				c2 += Math.abs(sum) + 1;
				sum = sign;
			}
			sign *= -1;
		}
		System.out.println(Math.min(c1, c2));
	}
}