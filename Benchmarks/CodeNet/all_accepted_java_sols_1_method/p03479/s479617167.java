import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		int cnt = 1;
		long tmp = x;
		while (true) {
			tmp *= 2;
			if (tmp > y) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
