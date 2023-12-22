import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int ans = 0;
		if (X <= 599) {
			ans = 8;
		} else if (X <= 799) {
			ans = 7;
		} else if (X <= 999) {
			ans = 6;
		} else if (X <= 1199) {
			ans = 5;
		} else if (X <= 1399) {
			ans = 4;
		} else if (X <= 1599) {
			ans = 3;
		} else if (X <= 1799) {
			ans = 2;
		} else {
			ans = 1;
		}

		System.out.println(ans);
	}
}
