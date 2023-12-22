import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int N = s.length();

		// N→S、S→N、E→W、W→Eがないといけない。
		boolean northFlag = false;
		boolean southFlag = false;
		boolean eastFlag = false;
		boolean westFlag = false;

		char[] mojiretsu = s.toCharArray();

		for (int i = 0; i < N; i++) {
			if (northFlag && southFlag && eastFlag && westFlag) {
				System.out.println("Yes");
				return;
			}
			switch (mojiretsu[i]) {
			case 'N':
				northFlag = true;
				break;
			case 'S':
				southFlag = true;
				break;
			case 'E':
				eastFlag = true;
				break;
			case 'W':
				westFlag = true;
				break;
			}
		}
		if (northFlag && southFlag || !northFlag && !southFlag) {
			if (eastFlag && westFlag || !eastFlag && !westFlag) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
