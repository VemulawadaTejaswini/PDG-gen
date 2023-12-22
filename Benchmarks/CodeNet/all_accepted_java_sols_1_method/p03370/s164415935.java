import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] nums = new int[n];
		int sum = 0;
		int min = 10000;
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];

			min = min > nums[i] ? nums[i] : min;
		}

		int cnt = 0;
		x -= sum;
		cnt += n;
		cnt += (x / min);

		System.out.print(cnt);
	}
}
