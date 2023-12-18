import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, i = 1;
		while (true) {
			x = scan.nextInt();
			if (x == 0)
				break;
			System.out.println("Case" + i + ": " + x);
			i++;
		}
	}