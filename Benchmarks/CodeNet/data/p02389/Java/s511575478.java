import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();
			String[] tmpArray = line.split(" ");
			Rectangle rect = new Rectangle(Integer.parseInt(tmpArray[0]),
					Integer.parseInt(tmpArray[1]));
			System.out.println(rect.getArea() + " " + rect.getPerimeter());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
class Rectangle {

	private int vertical = 0;
	private int side = 0;

	public Rectangle(int v, int s) {
		vertical = v;
		side = s;
	}

	public int getArea() {
		return vertical * side;
	}

	public int getPerimeter() {
		return (vertical + side) * 2;
	}
}
