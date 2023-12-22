import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();

		char[] c = s.toCharArray();
		for (int i = 0; i < n; i++) {
			if (c[i] != c[k - 1])
				c[i] = '*';
		}

		String ans = String.valueOf(c);
		System.out.println(ans);

		sc.close();
	}

}
