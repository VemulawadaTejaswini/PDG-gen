public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			while (true) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if (x == 0 && y == 0) {
					break;
				}
				System.out.println(Math.min(x, y)  + " "  + Math.max(x, y));
			}
		}
	}
}
