public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 1 || b == 1) {
			if (a == b) {
				System.out.println("Draw");
			}else if (a < b) {
				System.out.println("Alice");
			}else {
				System.out.println("Bob");
			}
		}else {
			if (a < b) {
				System.out.println("Bob");
			} else if (a > b) {
				System.out.println("Alice");
			} else {
				System.out.println("Draw");
			}
		}
	}
}