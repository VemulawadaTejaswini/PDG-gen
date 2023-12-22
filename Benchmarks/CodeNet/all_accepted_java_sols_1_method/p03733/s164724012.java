import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] time = new int[n];
		long sum = 0, tmp;
		time[0] = sc.nextInt();
		for (int i = 1; i < n; i++) {
			time[i] = sc.nextInt();
			if (time[i] - time[i - 1] >= t) {
				sum += t;
			}else {
				sum += time[i] - time[i-1];
			}
		}
		sum = sum + t;
		System.out.println(sum);
	}
}
