import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		int k = Integer.parseInt(sc.nextLine());

		int max = 0;
		int ans = 0;
		for (String s : abc.split(" ")) {
			int i = Integer.parseInt(s);
			if (i > max) {
				ans += max;
				max = i;
			} else {
				ans += i;
			}
		}

		System.out.println(ans + max * ((int) Math.pow(2, k)));

		sc.close();
	}
}