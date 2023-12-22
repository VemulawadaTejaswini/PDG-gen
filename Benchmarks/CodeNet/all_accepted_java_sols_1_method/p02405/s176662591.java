import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int h = Integer.parseInt(in.next());
			int w = Integer.parseInt(in.next());
			if (h == 0 && w == 0) {
				break;
			}
			for (int i = 1; i <= h; i++) {
				switch (i % 2) {
				case 1:
					for (int j = 1; j <= w; j++) {
						switch (j % 2) {
						case 1:
							System.out.print("#");
							break;
						case 0:
							System.out.print(".");
							break;
						}
					}
					break;
				case 0:
					for (int j = 1; j<= w; j++) {
						switch (j % 2) {
						case 1:
							System.out.print(".");
							break;
						case 0:
							System.out.print("#");
							break;
						}
					}
					break;
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}	
