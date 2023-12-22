import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		if (b != 1) {
			b = b - a;
			a--;
			cnt++;
			while (b > 0) {
				b = b - a;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
