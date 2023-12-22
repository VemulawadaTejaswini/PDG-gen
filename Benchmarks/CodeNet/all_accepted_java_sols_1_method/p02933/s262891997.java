import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int BORDER = 3200;
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		String s = scan.nextLine();
		if (a < BORDER) {
			System.out.println("red");
		} else {
			System.out.println(s);
		}
		scan.close();
	}
}
