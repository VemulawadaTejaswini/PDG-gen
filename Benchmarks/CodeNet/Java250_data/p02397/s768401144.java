import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		int tmp;
		
		while (true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if (x > y) {
				tmp = x;
				x = y;
				y = tmp;
			}
			if (x == 0 && y == 0)
				break;
			str.append(x + " " + y + "\n");
		}

		System.out.print(str);

	}
}