import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		
		long[] a = new long[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		
		Arrays.sort(a);
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			x -= a[i];
			if(x == 0) {
				sum++;
				break;
			} else if(x > 0) {
				sum++;
				if(i == N - 1) {
					sum--;
				}
			}
		}
		System.out.println(sum);
	}
}
