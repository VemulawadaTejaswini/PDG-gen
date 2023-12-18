import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] p = new int [n];

		int sum = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			if(count < k) {
				sum += p[i];
				count++;
			}
		}

		int tmpAns = sum;
		for(int i = k; i < n; i++) {
			sum = sum - p[i-k] + p[i];
			tmpAns = Math.max(tmpAns, sum);
		}

		double ans = (tmpAns + k) / 2.0;
		System.out.println(ans);
	}

}
