import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);
		int sum =0;
		for (int i=0;i<K;i++) {
			sum +=a[N-1-i];
		}
		System.out.println(sum);
	}
}