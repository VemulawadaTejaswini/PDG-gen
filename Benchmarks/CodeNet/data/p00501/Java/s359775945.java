import java.util.Scanner;

public class Main {
	static int n;
	static String name;
	static String b[];
	static int cnt;

	public static boolean check(int i, int j, int k) {
		for (int l = 0; l < name.length(); l++) {
			if (b[i].length() <= j + k * l || name.charAt(l) != b[i].charAt(j + k * l)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		name = sc.next();
		b = new String[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		cnt = 0;

		L1: for (int i = 0; i < n; i++) {
			for (int j = 0; j < b[i].length(); j++) {
				for (int k = 1; k < b[i].length(); k++) {
					if (check(i, j, k)) {
						cnt++;
						continue L1;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}