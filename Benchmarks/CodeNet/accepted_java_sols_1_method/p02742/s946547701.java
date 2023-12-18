import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		if (w == 1 || h == 1) {
			System.out.println(1);
		} else {
			long res = (h / 2L + h % 2L) * (w / 2L + w % 2L);
			--h;
			--w;
			res += (h / 2L + h % 2L) * (w / 2L + w % 2L);
			System.out.println(res);
		}
	}
}
