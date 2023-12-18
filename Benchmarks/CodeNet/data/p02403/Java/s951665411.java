import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			Rectangle rectangle = new Rectangle();
			while (true) {
				int h = stdIn.nextInt();
				int w = stdIn.nextInt();
				if (h > 300 || w > 300) {
					throw new RuntimeException("Input Error:range 0 to 300");
				}
				if (h == 0 && w == 0) {
					break;
				}
				rectangle.setChar('#');
				rectangle.draw(h, w);
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

final class Rectangle {
	private Character displayChar = '*';

	/**
	 * Set a character to draw shape
	 * @param displayChar a character
	 */
	protected void setChar(Character displayChar) {
		this.displayChar = displayChar;
	}

	/**
	 * Draw square
	 * @param height Height of square
	 * @param width Width of square
	 */
	protected void draw(int height, int width) {
		if (height < 0 || width < 0) {
			throw new RuntimeException("Input Error:Minus value input");
		}
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print(this.displayChar);
			}
			System.out.println("");
		}
	}
}