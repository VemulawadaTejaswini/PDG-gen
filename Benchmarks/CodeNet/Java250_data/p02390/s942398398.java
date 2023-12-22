import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int second = scanner.nextInt();
		int h;
		int m;
		int s;
		
		h = second / 3600;
		second = second - h * 3600;
		m = second / 60;
		second = second - m * 60;
		s = second;
		
		System.out.println(h + ":" + m + ":" + s);

	}
}