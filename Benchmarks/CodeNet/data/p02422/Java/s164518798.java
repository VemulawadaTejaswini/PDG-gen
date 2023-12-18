public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			String str = sc.next();
			int cntCommand = sc.nextInt();

			for (int i = 0; i < cntCommand; i++) {
				String command = sc.next();
				int begin = sc.nextInt();
				int end = sc.nextInt();

				if (command.equals("print")) {
					System.out.println(str.substring(begin, end + 1));
				} else if (command.equals("reverse")) {
					str = reverse(begin, end, str);
				} else if (command.equals("replace")) {
					str = replace(begin, end, str, sc.next());
				}
			}

		}
	}

	private static String reverse(int begin ,int end, String str) {
		char[] arr = str.toCharArray();
		int num = end - begin +1;
		
		for (int i = 0; i < (num / 2); i++) {
			char tmp = arr[begin + i];
			arr[begin + i] = arr[end - i];
			arr[end - i] = tmp;
		}
		return String.valueOf(arr);
	}

	private static String replace(int begin, int end, String target, String replacemant) {
		char work[] = target.toCharArray();
		char repl[] = replacemant.toCharArray();

		for (int i = begin; i <= end; i++) {
			work[i] = repl[i - begin];
		}
		return String.valueOf(work);
	}
}
