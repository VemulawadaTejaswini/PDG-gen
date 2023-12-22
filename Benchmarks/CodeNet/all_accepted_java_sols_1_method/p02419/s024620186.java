import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String line1 = sc.next().toUpperCase();
		while (sc.hasNext()) {
			String line2 = sc.next().toUpperCase();

			if(line2.equals(line1)) {
				count++;
			}

		}
		System.out.println(count);

	}

}