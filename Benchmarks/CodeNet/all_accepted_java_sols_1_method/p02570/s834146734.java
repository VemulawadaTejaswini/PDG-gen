public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var d = sc.nextInt();
		var t = sc.nextInt();
		var s = sc.nextInt();

		System.out.println(((double) d / s <= t) ? "Yes" : "No");

	}
}
