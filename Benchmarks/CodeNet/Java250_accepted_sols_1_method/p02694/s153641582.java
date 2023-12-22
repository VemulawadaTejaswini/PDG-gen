import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long x = kb.nextLong();
		long y = 100;
		int count = 0;
		while (true) {
			y = (long) (1.01 * y);
			count += 1;
			if (y >= x) {
				System.out.println(count);
				break;
			}

		}
		kb.close();
	}

}
