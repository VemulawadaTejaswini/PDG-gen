
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N / 100;
		int b = (N / 10) % 10;
		int c = N % 10;
		int ans = 0;
		if(a >= b && a >= c) {
			ans = a * 100 + a * 10 + a;
		} else {
			ans = (a + 1) * 100 + (a + 1) * 10 + a + 1;
		}
		System.out.println(ans);
	}

}
