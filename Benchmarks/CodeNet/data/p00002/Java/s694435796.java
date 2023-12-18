import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			System.out.println(String.valueOf(scan.nextInt()
					+ scan.nextInt()).length);
		}
	}
}