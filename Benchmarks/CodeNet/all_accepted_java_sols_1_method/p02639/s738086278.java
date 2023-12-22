import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ans = 0;
		for (int i=1; i<=5; i++) {
			if (0 == sc.nextInt()) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}