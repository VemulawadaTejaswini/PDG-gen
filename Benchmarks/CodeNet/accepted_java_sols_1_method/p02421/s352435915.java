import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int taro = 0;
		int hanako = 0;
		int n = Integer.parseInt(s.next());
		for (int i = 0; i < n; ++i) {
			int c = s.next().compareTo(s.next());
			if (c > 0) {
				taro += 3;
			} else if (c == 0) {
				taro++;
				hanako++;
			} else {
				hanako += 3;
			}
		}
		System.out.printf("%d %d\n", taro, hanako);
	}
}