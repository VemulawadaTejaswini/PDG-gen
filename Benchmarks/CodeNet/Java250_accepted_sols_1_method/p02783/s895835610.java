import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int ans = 0;

		while(h > 0) {
			h -= a;
			ans++;
		}

		System.out.println(ans);
	}

}
