import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] b = new boolean[4];

		for (int i = 0; i < n; i++) {
			char a = sc.next().charAt(0);
			switch (a) {
				case 'P':
				b[0] = true;
				break;
				case 'W':
				b[1] = true;
				break;
				case 'G':
				b[2] = true;
				break;
				case 'Y':
				b[3] = true;
				break;
			}
		}

		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			if (b[i]) {
				cnt++;
			}
		}

		if (cnt == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
	}
}
