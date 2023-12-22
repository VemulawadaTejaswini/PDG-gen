public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var x = sc.nextLong();
		var k = sc.nextLong();
		var d = sc.nextLong();
		x = Math.abs(x);
		if (x == 0) {
			if (k % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(d);
			}
		} else {
			var risouMaxK = x / d + 1;
			if (risouMaxK > k) {
				System.out.println(Math.abs(x - k * d));
			} else {
				if (risouMaxK % 2 == 0 && k % 2 == 0
						|| risouMaxK % 2 != 0 && k % 2 != 0) {
					System.out.println(Math.abs(x - risouMaxK * d));
				} else {
					var risouMaxK2 = x / d;
					System.out.println(Math.abs(x - risouMaxK2 * d));
				}

			}
		}

	}
}