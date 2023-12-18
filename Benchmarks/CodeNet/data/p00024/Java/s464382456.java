import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double V = sc.nextDouble();
			int F = 1;
			int N = Nhantei(F, V);
			System.out.println(N);
		}
		sc.close();
	}

	static int Nhantei(int n, double v) {
		if (n < (int)(v * v / 98) + 1)
			return Nhantei(n + 1, v);
		else
			return n;
	}
}