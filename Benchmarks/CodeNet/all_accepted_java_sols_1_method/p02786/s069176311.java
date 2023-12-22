import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long h = sc.nextLong();
		long ans = 0, i = 0;
		while (h >= 1) {
			ans += Math.pow(2, i);
			h /= 2;
			i++;
		}
		System.out.println(ans);
	}
}