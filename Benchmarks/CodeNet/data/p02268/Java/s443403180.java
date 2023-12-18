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
			count += BinarySearch (dataS, search);
		}
		scan.close();
		System.out.println(count);
	}
	
	public static int BinarySearch (int[] data, int s) {
		int left = 0;
		int right = data.length;
		
		while (left < right) {
			int mid = (left + right) / 2;
			if (data[mid] == s) {
				return 1;
			} else if (s > data[mid]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		
		
		return 0;
	}
}

