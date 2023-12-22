public class Main {
 public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a <= 5) {
			System.out.println(0);
		} else if (a <= 12) {
			System.out.println(b / 2);
		} else {
			System.out.println(b);
		}
	}
}