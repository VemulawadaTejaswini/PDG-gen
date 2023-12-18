public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var a = sc.nextInt();
		var b = sc.nextInt();
		if ((b - 2 * a) % 2 != 0 || (b - 2 * a) < 0 || (a - (b - 2 * a) / 2 < 0)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
