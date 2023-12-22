import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] h = new int[n];

		int i;
		for(i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}

		Arrays.sort(h);

		if(k >= n) {
			System.out.println(0);
			return;
		}else {
			long sum = 0;
			for(i = 0; i < n - k; i++) {
				sum += h[i];
			}
			System.out.println(sum);
			return;
		}

	}
}