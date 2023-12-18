import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String X = sc.next();
		for (int i = 0; i < N; i++) {
			StringBuilder x = new StringBuilder(X);
			x.replace(i, i + 1, (X.charAt(i) == '0') ? "1" : "0");
			int a = Integer.parseInt(x.toString(), 2);
			int b = popcount(x.toString());
			int ans = 0;
			while (a != 0) {
				a = a % b;
				b = popcount(Integer.toBinaryString(a));
				ans++;
			}
			System.out.println(ans);
		}

	}

	public static int popcount(String bin) {
		int count = 0;
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

}
