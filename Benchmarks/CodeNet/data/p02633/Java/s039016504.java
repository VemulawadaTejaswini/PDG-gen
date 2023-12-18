
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int cnt = 0;
			int tmp = 0;
			do {
				tmp += x;
				tmp %= 360;
				cnt++;
			} while(tmp != 0);
			System.out.println(cnt);
		}
	}
}
