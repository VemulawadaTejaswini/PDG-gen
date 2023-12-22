import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long min = sc.nextInt();
		long max = min;
		for(int i = 0; i < N-1; i++) {
			long A = sc.nextInt();
			min = Math.min(min,A);
			max = Math.max(max, A);
		}
		System.out.println(max-min);
	}
}
