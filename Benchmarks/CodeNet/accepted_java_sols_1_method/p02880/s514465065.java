
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		long N = sc.nextInt();

		boolean b = false;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i*j == N) {
					System.out.println("Yes");
					b = true;
					break;
				}
			}
			if (b) {
				break;
			}
		}

		if (!b) {
			System.out.println("No");
		}
	}
}