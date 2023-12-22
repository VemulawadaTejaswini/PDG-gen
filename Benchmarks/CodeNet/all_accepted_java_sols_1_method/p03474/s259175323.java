import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String[] input = sc.next().split("");
		for (int i = 0; i < input.length; i++) {
			if (i == A) {
				if (!input[i].equals("-")) {
					System.out.println("No");
					System.exit(0);
				} else {
					continue;
				}
			}
			try {
				Integer.parseInt(input[i]);
			} catch (Exception e) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
