import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		c += 1;
		System.out.println(c);
		in.close();
	}
}