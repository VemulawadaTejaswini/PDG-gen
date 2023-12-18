public class Main {
	public static void main(String[] args) {
		final String EOF = "END_OF_TEXT";

		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			sc.useDelimiter("\\s|\\n|\\r");
			int cnt = 0;
			String word = sc.next();
			String text = sc.next();

			while (!text.equals(EOF)) {
				cnt = text.equalsIgnoreCase(word) ? ++cnt : cnt;
				text = sc.next();
			}
			System.out.println(cnt);
		}
	}
}
