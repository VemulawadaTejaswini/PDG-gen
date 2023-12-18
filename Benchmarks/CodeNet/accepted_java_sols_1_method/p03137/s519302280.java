

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if(m <= n){
			System.out.println(0);
			return;
		}

		int x[] = new int[m];

		for(int i = 0; i < m; i++){
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);
		int left[] = new int[m];
		int sum = 0;
		for(int i = 1; i < m; i++){
			left[i] = x[i] - x[i - 1];
			sum += left[i];
//			System.out.println(left[i]);
		}
		Arrays.sort(left);

		int skippable = 0;
		for(int i = 0; i < n - 1; i++){
			skippable += left[m - i - 1];
//			System.out.println(skippable);
		}


		System.out.println(sum - skippable);
	}
}
