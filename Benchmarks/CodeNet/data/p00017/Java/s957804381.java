import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int diffThe[]  = new int[2];
		int diffThis[] = new int[3];
		int diffThat[] = new int[3];
		String st;
		int count;
		int k;

		diffThe[0] = 'h' - 't';
		diffThe[0] = (diffThe[0] < 0) ? diffThe[0] + 'z' : diffThe[0];
		diffThe[1] = 'e' - 'h';
		diffThe[1] = (diffThe[1] < 0) ? diffThe[1] + 'z' : diffThe[1];

		diffThis[0] = 'h' - 't';
		diffThis[0] = (diffThis[0] < 0) ? diffThis[0] + 'z' : diffThis[0];
		diffThis[1] = 'i' - 'h';
		diffThis[1] = (diffThis[1] < 0) ? diffThis[1] + 'z' : diffThis[1];
		diffThis[2] = 's' - 'i';
		diffThis[2] = (diffThis[2] < 0) ? diffThis[2] + 'z' : diffThis[2];

		diffThat[0] = 'h' - 't';
		diffThat[0] = (diffThat[0] < 0) ? diffThat[0] + 'z' : diffThat[0];
		diffThat[1] = 'a' - 'h';
		diffThat[1] = (diffThat[1] < 0) ? diffThat[1] + 'z' : diffThat[1];
		diffThat[2] = 't' - 'a';
		diffThat[2] = (diffThat[2] < 0) ? diffThat[2] + 'z' : diffThat[2];

		while (sc.hasNext()) {
			st = sc.nextLine();
			count = 0;
			k = 0;

			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) != ' ' && st.charAt(i) != '.') {
					count++;
				} else {
					if (count == 3) {
						if (isThe(st, i, diffThe)) {
							k = 't' - st.charAt(i - 3);
							break;
						}
					} else if (count == 4) {
						if (isThis(st, i, diffThis)) {
							k = 't' - st.charAt(i - 4);
							break;
						}
						if (isThat(st, i, diffThat)) {
							k = 't' - st.charAt(i - 4);
							break;
						}
					}
					count = 0;
				}
			}
			if (count == 3) {
				if (isThe(st, st.length(), diffThe)) {
					k = 't' - st.charAt(st.length() - 3);
				}
			} else if (count == 4) {
				if (isThis(st, st.length(), diffThis)) {
					k = 't' - st.charAt(st.length() - 4);
				}
				if (isThat(st, st.length(), diffThat)) {
					k = 't' - st.charAt(st.length() - 4);
				}
			}
			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) != ' ' && st.charAt(i) != '.') {
					int c = st.charAt(i) + k;
					c = ('z' < c) ? c - 'z' : c;
					c = (c < 'a') ? c + 'z' : c;
					System.out.print((char)c);
				} else {
					System.out.print(st.charAt(i));
				}
			}
			System.out.println();
		}
	}

	public static boolean isThe(String st, int i, int diffThe[]) {
		int a;

		a = st.charAt(i - 2) - st.charAt(i - 3);
		a = (a < 0) ? a + 'z' : a;
		if (a == diffThe[0]) {
			a = st.charAt(i - 1) - st.charAt(i - 2);
			a = (a < 0) ? a + 'z' : a;
			if (a == diffThe[1]) {
				return true;
			}
		}
		return false;
	}

	public static boolean isThis(String st, int i, int diffThis[]) {
		int a;

		a = st.charAt(i - 3) - st.charAt(i - 4);
		a = (a < 0) ? a + 'z' : a;
		if (a == diffThis[0]) {
			a = st.charAt(i - 2) - st.charAt(i - 3);
			a = (a < 0) ? a + 'z' : a;
			if (a == diffThis[1]) {
				a = st.charAt(i - 1) - st.charAt(i - 2);
				a = (a < 0) ? a + 'z' : a;
				if (a == diffThis[2]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isThat(String st, int i, int diffThat[]) {
		int a;

		a = st.charAt(i - 3) - st.charAt(i - 4);
		a = (a < 0) ? a + 'z' : a;
		if (a == diffThat[0]) {
			a = st.charAt(i - 2) - st.charAt(i - 3);
			a = (a < 0) ? a + 'z' : a;
			if (a == diffThat[1]) {
				a = st.charAt(i - 1) - st.charAt(i - 2);
				a = (a < 0) ? a + 'z' : a;
				if (a == diffThat[2]) {
					return true;
				}
			}
		}
		return false;
	}
}