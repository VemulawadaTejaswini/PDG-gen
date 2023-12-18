
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String S = sc.next();

		String[] s = S.split("");

		int array10 = 0;
		int array01 = 0;
		for (int i = 0; i < s.length; i++) {
			int tmp = Integer.parseInt(s[i]);
			if (i % 2 != 0) {
				// 偶数
				if (tmp == 0) {
					array01++;
				} else {
					array10++;
				}
			} else {
				// 奇数
				if (tmp == 0) {
					array10++;
				} else {
					array01++;
				}
			}
		}

		System.out.println(Math.min(array10, array01));
	}
}
