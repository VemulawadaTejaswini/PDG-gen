import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int index = 0;
		int ans = 0;

		while ((++index) * (index) <= N) {
			ans = index * index;
		}
		System.out.println(ans);

	}
}