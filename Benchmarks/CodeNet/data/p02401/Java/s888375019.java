public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			while (true) {
				int a = sc.nextInt();
				String op = sc.next();
				int b = sc.nextInt();

				if (op.equals("?")) {
					break;
				} else if (op.equals("+")) {
					System.out.println(a + b);
				} else if (op.equals("-")) {
					System.out.println(a - b);
				} else if (op.equals("*")) {
					System.out.println(a * b);
				} else if (op.equals("/")) {
					System.out.println(a / b);
				}

			}
		}
	}
}
