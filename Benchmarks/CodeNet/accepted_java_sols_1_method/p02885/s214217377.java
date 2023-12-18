import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int b = sc.nextInt();
			int ans = num - b * 2;
			if (ans < 0) {
				System.out.println(0);
			} else {
				System.out.println(ans);
			}
		}
	}
}