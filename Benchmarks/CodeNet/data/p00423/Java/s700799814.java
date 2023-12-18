import java.util.*;

public class Card_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int a = 0;
			int b = 0;
			for (int i = 0; i < n; i++) {
				int ta = sc.nextInt();
				int tb = sc.nextInt();
				if (ta > tb)
					a += ta + tb;
				else if (ta < tb)
					b += ta + tb;
				else {
					a += ta;
					b += tb;
				}
			}
			System.out.println(a + " " + b);
		}
		sc.close();
	}
}