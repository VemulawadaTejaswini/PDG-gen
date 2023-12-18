
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int taro = 0;
		int hanako = 0;
		int n = Integer.parseInt(scan.nextLine());
		String a, b;
		for (int i = 0; i < n; i++) {
			String[] str = scan.nextLine().split(" ");
			a = str[0];
			b = str[1];
			if (a.compareTo(b) < 0) {
				hanako = hanako + 3;
			} else if (a.compareTo(b) > 0) {
				taro = taro + 3;
			} else {
				hanako = hanako + 1;
				taro = taro + 1;
			}
		}
		System.out.printf("%d %d\n", taro, hanako);
	}

}