import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ss = sc.next();
		String[] s = ss.split("");
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (s[i].equals(s[i + 1])) {
				s[i] = "null";
			}
		}
		for (int i = 0; i < n; i++) {
			if (!s[i].equals("null")) {
				count++;
			}
		}
		System.out.println(count);
	}
}