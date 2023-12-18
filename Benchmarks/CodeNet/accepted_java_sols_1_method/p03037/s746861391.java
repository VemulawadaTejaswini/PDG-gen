import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		final var n = scanner.nextInt();
		final var m = scanner.nextInt();
		var l = 1;
		var r = n;
		for (var i = 1; i <= m; i++) {
			var ll = scanner.nextInt();
			var rr = scanner.nextInt();
			l = Math.max(l, ll);
			r = Math.min(r, rr);

			if(r < l) {
				System.out.println(0);
				scanner.close();
				return;
			}
		}
		System.out.println(r - l + 1);
		scanner.close();
	}

}
