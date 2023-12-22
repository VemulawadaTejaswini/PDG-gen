import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x2 = in.nextInt();
		int i = 1;
		int x = 1;
		while (i <= 3) {
			x *= x2;
			i++;
		}
		System.out.println(x);

	}

}