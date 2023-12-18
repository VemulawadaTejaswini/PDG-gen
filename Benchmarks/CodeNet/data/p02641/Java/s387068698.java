import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int N = scan.nextInt();
		int p;
		int p1;
		int min = 101;
		int ans = 0;

		for(int i = 0;i < N;i++) {
			p = scan.nextInt();
			p1 = Math.abs(N - p);
			if(min > p1) {
				min = p1;
				ans = p;
			}
		}

		System.out.println(ans);

	}
}