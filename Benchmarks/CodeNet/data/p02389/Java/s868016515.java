import java.util.Scanner;

class Rectangle {
	private int _virtical;
	private int _horizontal;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int virtical, int horizontal) {
		_virtical = virtical;
		_horizontal = horizontal;
	}
	
	public int getArea() {
		return _virtical * _horizontal;
	}
	
	public int getPerimeter() {
		return _virtical * 2 + _horizontal * 2;
	}
}
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle(scan.nextInt(), scan.nextInt());
		System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
	}

}

