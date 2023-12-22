import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.close();
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		int ans = 0;
		for (int i = 0; i < s.length(); i++)
			if (c1[i] == c2[i])
				ans++;

		System.out.println(ans);

	}
}