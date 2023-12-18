public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			System.out.println((a< b && b < c) ? "Yes" : "No");
		}
	}
}
