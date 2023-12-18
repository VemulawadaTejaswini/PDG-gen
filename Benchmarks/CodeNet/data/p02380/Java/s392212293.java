import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");

		double length01 = Double.parseDouble(str[0]);
		double length02 = Double.parseDouble(str[1]);
		double angle = Math.toRadians(Double.parseDouble(str[2]));

		double area = (length01 * length02 * Math.sin(angle)) / 2;
		double sumLength = (length01 + length02) + Math.sqrt((length01 * length01) + (length02 * length02) - (2 * length01 * length02 * Math.cos(angle)));
		double high = length02 * Math.sin(angle);

		System.out.println(area + "\n" + sumLength + "\n" + high);
	}

}