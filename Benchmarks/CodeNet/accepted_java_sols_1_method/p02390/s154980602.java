import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sec = scanner.nextInt();

		// ??????
		int h = sec / 3600;

		// ???
		int m = (sec - (3600 * h)) / 60;

		// ?§?
		int s = sec - (3600 * h) - (60 * m);

		System.out.println(h + ":" + m + ":" + s);
	}

}