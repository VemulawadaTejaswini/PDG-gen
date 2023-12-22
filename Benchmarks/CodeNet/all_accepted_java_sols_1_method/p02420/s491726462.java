public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			String str = null;

			while (!(str = sc.next()).equals("-")) {
				int m = sc.nextInt();

				for (int i = 0; i < m; i++) {
					int idx = sc.nextInt();
					str = str.substring(idx) + str.substring(0, idx);
				}
				System.out.println(str);
			}
		}
	}
}
