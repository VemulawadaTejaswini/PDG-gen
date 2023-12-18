import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < h; i++) {
			char[] c = sc.next().toCharArray();
			for (int j = 0; j < c.length; j++)
				if (c[j] == '#')
					cnt++;
		}

		String ans = cnt == h + w - 1 ? "Possible" : "Impossible";
		System.out.println(ans);
		sc.close();
	}

}
