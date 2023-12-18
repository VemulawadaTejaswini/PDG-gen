public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			String input = sc.nextLine();
			StringBuilder sb = new StringBuilder();

			for (char c : input.toCharArray()) {
				int num = c;
				if (num >= 65 && num <= 90) {
					num += 32;// to Lower
				} else if (num >= 97 && num <= 122) {
					num -= 32;// to Upper
				}
				sb.append((char) num);
			}

			System.out.println(sb);
		}
	}
}
