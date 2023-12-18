import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(sc.next());
			int tem = 0;
			for (; a % 2 == 0; a /= 2)
				tem++;
			if (tem < ans || i == 0)
				ans = tem;
		}
		System.out.println(ans);
	}
}