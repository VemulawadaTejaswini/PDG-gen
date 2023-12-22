import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < h; i++) {
			cnt += sc.next().replace(".", "").length();
		}

		String ans = cnt == h + w - 1 ? "Possible" : "Impossible";
		System.out.println(ans);
		sc.close();
	}

}
