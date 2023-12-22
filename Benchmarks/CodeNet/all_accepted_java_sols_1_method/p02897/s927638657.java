import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if (N % 2 == 0) {
			System.out.println(String.format("%.8f", 0.5));
		} else {
			double ans = Math.ceil(N / 2.0) / N;
			System.out.println(String.format("%.8f", ans));
		}
	}
}
