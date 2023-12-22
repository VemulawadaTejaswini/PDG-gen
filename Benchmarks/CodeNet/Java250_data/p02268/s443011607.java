import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] S = new long[n];

		for(int i = 0; i < n; i++) {
			S[i] = sc.nextLong();
		}

		int q = sc.nextInt();

		for(int j = 0; j < q; j++) {

			long T = sc.nextLong();
			binarySearch(S, T);
		}
		System.out.println(count);
	}
	
	public static void binarySearch(long[] S, long T) {
		int left = 0;
		int right = S.length;
		
		while(left < right) {
			int mid = (left + right) / 2;
			if(S[mid] == T) {
				count++;
				return;
			} else if(S[mid] > T) {
				right = mid;
			} else if(S[mid] < T) {
				left = mid + 1;
			}
		}
	}

}
