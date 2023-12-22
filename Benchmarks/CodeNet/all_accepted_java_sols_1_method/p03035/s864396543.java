import java.util.Scanner;

//AtCoder Beginner Contest 127
//A	Ferris Wheel
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		int ans = 0;
		if (A >= 13) {
			ans = B;
		} else if (A <= 5) {
			ans = 0;
		} else {
			ans = B / 2;
		}

		System.out.print(ans);
	}
}
