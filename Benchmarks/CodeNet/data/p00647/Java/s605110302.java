import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int lunch, dinner, midnight;
		int kLunch, kDinner, kMidnight;
		int timeBegin[], timeEnd[];
		int a;
		String st;

		n = sc.nextInt();
		while (n != 0) {
			lunch     = 0;
			dinner    = 0;
			midnight  = 0;
			kLunch    = 0;
			kDinner   = 0;
			kMidnight = 0;
			timeBegin = new int[n];
			timeEnd   = new int[n];

			for (int i = 0; i < n; i++) {
				st = sc.next();
				timeBegin[i] = 1000*Integer.parseInt("" + st.charAt(0)) + 100*Integer.parseInt("" + st.charAt(1)) + 10*Integer.parseInt("" + st.charAt(3)) + Integer.parseInt("" + st.charAt(4));
				if (timeBegin[i] < 1000) {
					timeBegin[i] += 2400;
				}
				timeEnd[i]   = sc.nextInt();

				a = timeEnd[i] - (timeBegin[i] % 100);
				if (a < 0) {
					a += 60;
				}

				if (1100 <= timeBegin[i] && timeBegin[i] <= 1459) {
					kLunch++;
					if (a <= 8) {
						lunch++;
					}
				} else if (1800 <= timeBegin[i] && timeBegin[i] <= 2059) {
					kDinner++;
					if (a <= 8) {
						dinner++;
					}
				} else if (2100 <= timeBegin[i] && timeBegin[i] <= 2559) {
					kMidnight++;
					if (a <= 8) {
						midnight++;
					}
				}
			}

			System.out.print("lunch ");
			if (kLunch == 0) {
				System.out.println("no guest");
			} else {
				System.out.println((int)(lunch * 100 / kLunch));
			}
			System.out.print("dinner ");
			if (kDinner == 0) {
				System.out.println("no guest");
			} else {
				System.out.println((int)(dinner * 100 / kDinner));
			}
			System.out.print("midnight ");
			if (kMidnight== 0) {
				System.out.println("no guest");
			} else {
				System.out.println((int)(midnight * 100 / kMidnight));
			}

			n = sc.nextInt();
		}
	}
}