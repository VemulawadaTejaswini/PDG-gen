import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			
			if (h == 0 && w == 0) {
				scanner.close();
				return;
			}
			
			for(int j = 0; j < w; j++) {
				System.out.print("#");
			}
			System.out.println();
			for(int i = 0; i < h - 2; i++) {
				System.out.print("#");
				for(int j = 0; j < w - 2; j++) {
					System.out.print(".");
				}
				System.out.print("#");
				System.out.println();
			}
			for(int j = 0; j < w; j++) {
				System.out.print("#");
			}
			System.out.println();
			System.out.println();
		}
	}
}

