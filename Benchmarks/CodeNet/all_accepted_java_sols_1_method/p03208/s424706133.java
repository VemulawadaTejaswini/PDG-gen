import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++) {
			a[i] =sc.nextInt();
		}
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		for (int i=0;i<=N-K;i++) {
			if (min>a[K-1+i]-a[i]) {
				min = a[K-1+i]-a[i];
			}
		}
		System.out.println(min);
	}
}