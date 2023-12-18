import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		int i = 0;

		while (true) {
			i++;
			int x = scan.nextInt();
			
			if (x == 0)
				break;
			
			str.append("Case " + i + ": " + x + "\n");

		}

		System.out.println(str);

	}
}