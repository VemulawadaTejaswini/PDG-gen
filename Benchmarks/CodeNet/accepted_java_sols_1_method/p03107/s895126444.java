import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;

		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			char[] tmpArray = line.toCharArray();

			int num0 = 0;
			int num1 = 0;
			for (int i = 0; i < tmpArray.length ; i++) {
				if (tmpArray[i] == '0') {
					num0++;
				} else {
					num1++;
				}
			}
			System.out.println(Math.min(num0, num1) * 2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}