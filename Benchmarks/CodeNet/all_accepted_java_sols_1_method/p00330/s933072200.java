import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int W = s.nextInt();
		int res = W*32;
		System.out.println(res);

		s.close();

	}
}