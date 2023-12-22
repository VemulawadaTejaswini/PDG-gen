import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int s = v % 60;

		int h = v / 3600;
		int m =( v - h * 3600) / 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}