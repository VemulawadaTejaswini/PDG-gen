import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double p = (double) (N - N / 2) / (double) N;
		System.out.println(String.format("%.10f", p));
	}
}