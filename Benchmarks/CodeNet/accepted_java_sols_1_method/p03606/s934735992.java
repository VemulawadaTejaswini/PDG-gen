import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int x = 0;
		int y = 0;

		int ans = 0;
		for (int i = 0; i < n; i++) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			ans += y-x+1;
			
		}

		System.out.println(ans);

		sc.close();

	}
}