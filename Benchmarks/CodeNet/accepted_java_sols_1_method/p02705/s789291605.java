import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int r = sca.nextInt();
		double ans = 2*(3.141)*r;

		System.out.println(ans);

		// 後始末
		sca.close();
	}
}