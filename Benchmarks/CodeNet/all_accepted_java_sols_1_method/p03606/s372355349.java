import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < count; i++) {

			int min = sc.nextInt();
			int max = sc.nextInt();
			ans += max - min + 1;

		}
		System.out.println(ans);
		sc.close();
	}
}
