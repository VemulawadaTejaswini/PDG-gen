
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n + 1];

		for(int i = 2; i <= n; i++) {//2~nに対して
			int a = i;
			for(int j = 2; j <= a;) {//素因数分解して、因数をarray配列に詰める
				if(a % j == 0) {
					a = a / j;
					array[j]++;
				} else {
					j++;
				}
			}
		}
		long sum = 1;
		for(int i = 0; i <= n; i++) {
			sum *= (array[i] + 1);
			sum %= 1000000007;
		}

		System.out.println(sum);
	}
}


