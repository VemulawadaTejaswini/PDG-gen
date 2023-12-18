import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int count = 0;
		final int n = scan.nextInt();
		int[] dataS = new int[n];
		
		for (int i = 0; i < n; i++) {
			dataS[i] = scan.nextInt();
		}
		
		final int q = scan.nextInt();
		
		for (int i = 0; i < q; i++) {
			final int search = scan.nextInt();
			int left = 0;
			int right = n;
			
			while (left < right) {
				int mid = (left + right) / 2;
				if (dataS[mid] == search) {
					count++;
					break;
				} else if (search > dataS[mid]) {
					left = mid;
				} else {
					right = mid;
				}
			}
		}
		scan.close();
		System.out.println(count);
	}
}
