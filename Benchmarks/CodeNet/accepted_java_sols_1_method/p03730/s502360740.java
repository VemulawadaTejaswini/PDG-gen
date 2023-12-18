import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp = a;
		for (int i = 0;i < 1000000;i++) {
			if (tmp%b==c) {
				System.out.println("YES");
				return;
			}
			tmp += a;
		}
		System.out.println("NO");
	}
}
