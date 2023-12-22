import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		String line = scanner.next();
		
		int length = 1;
		char a = line.charAt(0);
		for (int i = 1; i < N; i++) {
			if (a != line.charAt(i)) {
				length++;
				a = line.charAt(i);
			}
		}

		System.out.println(length);

	}
}