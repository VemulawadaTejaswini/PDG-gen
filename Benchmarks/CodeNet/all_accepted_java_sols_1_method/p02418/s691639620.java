public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			String s = sc.next();
			String p = sc.next();
			int cnt = 0;

			while (cnt != s.length()) {
				if (s.contains(p)) {
					System.out.println("Yes");
					return;
				}

				s = s.substring(1) + s.charAt(0);
				cnt++;
			}

			System.out.println("No");
		}
	}
}
