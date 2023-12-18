import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //ターン数
		int judge, t = 0, h = 0;

		for (int i = 0; i < n; i++) { //ターン数繰り返す

			String tc = sc.next();
			String hc = sc.next();

			judge = tc.compareTo(hc);
			if (judge > 0) {
				t += 3;
			} else if (judge < 0) {
				h += 3;
			} else {
				t += 1;
				h += 1;
			}

		}
		System.out.println(t + " " + h);

	}

}

