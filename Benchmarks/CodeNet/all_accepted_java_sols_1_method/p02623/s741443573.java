import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long aSum[] = new long[n];
		long bSum[] = new long[m];
		aSum[0] = sc.nextLong();
		for(int i = 1 ; i < n ; i++) {
			aSum[i] = aSum[i - 1] + sc.nextLong();
		}
		int max = 0;

		if(k >= aSum[0]) {
			for(int i = 1 ; i < n ; i++) {
				if(k < aSum[i]) {
					max = i;
                  break;
				}
				if(i == n - 1) {
					max = n;
				}

			}

		}

		for(int i = 0 ; i < m ; i++) {
			if(i == 0)
				bSum[0] = sc.nextLong();
			else {
			bSum[i] = bSum[i - 1] + sc.nextLong();
			}
			long test = k - bSum[i];
			if(test >= 0) {
				max = Math.max(i + 1 , max);
			for(int j = max - i - 1 >= 0 && max - i - 1 < n ? max - i - 1: n ; j < n && test >= aSum[j] ; j++) {
				max = Math.max(j + 1 + i + 1 , max);
			}
			}
		}



		System.out.println(max);

	}
}

