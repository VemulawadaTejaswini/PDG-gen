import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int num[];
		int ans = 0, i = 0, a = 0;
		String b;
		char c;
		num = new int[1000];
		for (i = 0; i < 1000; ++i) {
			num[i] = 0;
		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			b = sc.next();
			a = Integer.parseInt(b);
			if (a == 0) {
				break;
			}
			for (i = 0; i < b.length(); ++i) {
				c = b.charAt(i);
				a = c - '0';
				num[i] = a;
			}
			i = 0;
			ans = 0;
			while (num[i] != 0) {
				ans += num[i];
				++i;
			}
			System.out.println(ans);
		}
		sc.close();
	}

}

