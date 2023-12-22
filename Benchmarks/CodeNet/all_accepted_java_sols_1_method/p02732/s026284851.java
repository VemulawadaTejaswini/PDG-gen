import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] in = new int[n];
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			in[i] = a;
			arr[a]++;
		}
		long[] res = new long[n + 1];
		long sum = 0;
		for (int i = 0; i <= n; i++) {
			res[i] = 0;
			for (int k = 1; k <= arr[i] - 1; k++) {
				res[i] += k;
			}
			sum += res[i];
		}
		for (int i = 0; i < n; i++) {
			long tmp = sum - res[in[i]];
			tmp += (res[in[i]] - 1) <= 0 ? 0 : (res[in[i]] - (arr[in[i]] - 1));
			System.out.println(tmp);
		}
	}

}
