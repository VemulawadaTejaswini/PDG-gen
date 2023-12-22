import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount_number = sc.nextInt();
		int answer = 0;

		ArrayList<Integer> array_number = new ArrayList<>();
		for (int i =0; i < amount_number; i++) {
			int input_number = sc.nextInt();
			array_number.add(input_number);
		}

		for (int i =0; i < amount_number; i++) {
			answer = answer + array_number.get(i);
		}

		if (answer % 2 == 0) {
		System.out.println("YES");
		}
		else {
		System.out.println("NO");
		}
	}
}
