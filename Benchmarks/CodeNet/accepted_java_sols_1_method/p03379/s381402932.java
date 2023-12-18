import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] arr = new long[N];
		long[] OG = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextLong();
			OG[i]=arr[i];
		}
		Arrays.sort(arr);
		int hi = N/2;
		int lo = hi-1;
		for (int i = 0; i < N; i++) {
			if (OG[i]<=arr[lo]) System.out.println(arr[hi]);
			else System.out.println(arr[lo]);
		}
	}
}