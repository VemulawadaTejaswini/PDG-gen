import java.util.Scanner;

//AtCoder Beginner Contest 130
//C	Rectangle Cutting
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextDouble();
		double H = sc.nextDouble();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();

		double ans = (W * H) / 2;

		int ans2 = 0;
		if (x * 2 == W && y * 2 == H) {
			ans2 = 1;
		}

		System.out.println(ans + " " + ans2);
	}
}
