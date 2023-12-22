import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		if(N % 2 == 0) {
			System.out.println(0.5000000000);
		}else if(N == 1) {
			System.out.println(1.0000000000);
		}else {
			int s = (N / 2) + 1;
			double ans =(double) s / N;
			 System.out.println(String.format("%.10f", ans));
		}
	}
}