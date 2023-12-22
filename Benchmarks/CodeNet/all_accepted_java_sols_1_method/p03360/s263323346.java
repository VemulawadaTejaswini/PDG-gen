import java.util.Scanner;
// import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] scan = scanner.nextLine().split(" ");
		int k = scanner.nextInt();
		scanner.close();
		// int a = Integer.parseInt(scan[0]);
		// int b = Integer.parseInt(scan[1]);
		// int c = Integer.parseInt(scan[2]);

		int max = 0;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			int n = Integer.parseInt(scan[i]);
			sum += n;
			if(max < n) max = n;
		}
		// int sum = max * (int)Math.pow(2, (k - 1));
		sum -= max;
		// int add = 1;
		// for(int i = 1; i < k; i++) {
		// 	// int n = Integer.parseInt(scan[i]);
		// 	add *= 2;
		// }
		sum += max * Math.pow(2, k);
		System.out.println(sum);
	}
}
