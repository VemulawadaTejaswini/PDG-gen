import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) sum += a[N - 1 - i];
			else sum -= a[N - 1 - i];
		}
		System.out.println(sum);
	}
}