import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i < 11111; i++) {
			int x = scanner.nextInt();
			if (x == 0) break;
		    //System.out.print(x);
		    //String trimmed = str.trim();
			System.out.printf("Case %d: %d\n", i, x);

		}

	}
}
