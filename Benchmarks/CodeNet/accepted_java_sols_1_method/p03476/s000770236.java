import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0 ; i < q ; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		// エラトステネスの篩で素数を調べる
		boolean[] isPrime = new boolean[100010];
		Arrays.fill(isPrime, true);
		for(int i = 2 ; i <= 100000 ; i++) {
			for(int j = i + i ; j <= 100000 ; j += i) {
				isPrime[j] = false;
			}
		}
		int[] sum = new int[100010];
		for(int i = 3 ; i <= 100000 ; i++) {
			if(isPrime[i] && isPrime[(i + 1) / 2]) sum[i]++;
		}
		for(int i = 3 ; i <= 100000 ; i++) {
			sum[i] += sum[i - 1];
		}
		for(int i = 0 ; i < q ; i++) {
			System.out.println(sum[r[i]] - sum[l[i] - 1]);
		}
	}
}
