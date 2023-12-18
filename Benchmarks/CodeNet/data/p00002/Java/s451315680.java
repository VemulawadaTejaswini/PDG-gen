import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			System.out.println(String.valueOf(s.nextInt() + s.nextInt()).length());
		}
	}
}