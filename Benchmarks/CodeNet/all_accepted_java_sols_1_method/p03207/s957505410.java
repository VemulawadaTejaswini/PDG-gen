import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			int p = sc.nextInt();
			max = Math.max(max, p);
			sum += p;
		}
		sc.close();
		sum -= max / 2;
		System.out.println(sum);
	}
}