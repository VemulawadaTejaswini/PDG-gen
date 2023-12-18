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
			for (int i = 0; i < w; i++) {
				System.out.print("#");
			}
			System.out.println("");
			for (int i = 1; i < h - 1; i++) {
				System.out.print("#");
				for (int j = 1; j < w - 1; j++) {
					System.out.print(".");
				}
				System.out.print("#");
				System.out.println("");
			}
			for (int i = 0; i < w; i++) {
				System.out.print("#");
			}
			System.out.println("\n");
		}
	}
}	
