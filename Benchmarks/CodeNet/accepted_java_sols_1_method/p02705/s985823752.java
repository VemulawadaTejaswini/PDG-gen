import java.util.Scanner;

public class  Main {
	public static void main(String[] args) {
		double r;
		double area;
		Scanner scanner = new Scanner(System.in);
		
		r = scanner.nextDouble();
		
		area = r * 3.14 * 2;
		
		System.out.println(area);
	}
}