import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] lines = sc.nextLine().split(" ");
			int height = Integer.parseInt(lines[0]);
			int width = Integer.parseInt(lines[1]);
			if(height == 0 && width == 0) {
				break;
			} else {
				for(int i = 0;i < height;i++) {
					for(int j = 0;j < width;j++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}

		}
	}
}