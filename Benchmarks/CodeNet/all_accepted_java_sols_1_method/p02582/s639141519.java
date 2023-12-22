import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int ans;

		if (s.equals("RRR")) {
			ans = 3;
		} else if (s.equals("RRS") || s.equals("SRR")) {
			ans = 2;
		} else if (s.equals("SSS")) {
			ans = 0;
		} else {
			ans = 1;
		}

		System.out.println(ans);

		sc.close();
	}

}