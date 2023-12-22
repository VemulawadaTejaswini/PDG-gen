import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int w;

		w = z;
		z = y;
		y = x;
		x = w;

		System.out.println(x + " " + y + " " + z);

		s.close();

	}

}
