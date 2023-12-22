import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		Integer a[] = new Integer[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Comparator.reverseOrder());

		int sum = 0;

		for(int i = 0; i < N; ++i) {
			if(i%2 == 0) sum += a[i];
			else sum -= a[i];
		}
		System.out.println(sum);
	}
}
