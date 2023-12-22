import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double ans = 0;
		
		if(N % 2 == 0) {
			ans = N / 2 / N;
			System.out.println(ans);
		} else {
			ans = (N + 1) / 2 / N;
			System.out.println(ans);
		}
		
	}
}
