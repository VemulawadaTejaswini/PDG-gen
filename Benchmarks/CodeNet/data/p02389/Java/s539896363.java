import java.util.Scanner;

public class Main {

  public static int area(int length, int width) {
    int area = length * width;
    return area;
  }

  public static int perimeter(int length, int width) {
    int perimeter = (length * 2) + (width * 2);
    return perimeter;
  }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
    int w = s.nextInt();
		System.out.println(area(l, w) + " " + perimeter(l, w));
	}
}

