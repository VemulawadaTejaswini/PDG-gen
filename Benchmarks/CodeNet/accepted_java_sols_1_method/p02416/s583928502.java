import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (; sc.hasNext();) {
			int sum = 0;
			char[] swap = sc.nextLine().toCharArray(); //char型の配列に格納する

			for (int i = 0; i < swap.length; i++) {
				sum = sum + Character.getNumericValue(swap[i]);
			}
			if (sum != 0) {
				System.out.println(sum);
			} else {
				break;
			}
		}

	}

}

