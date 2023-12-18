import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private final static int FIVE = 5;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int count = 0; count < FIVE; count++) {
			numbers.add(sc.nextInt());
		}

		Collections.sort(numbers);


		for(int count = FIVE - 1; count >= 0; count--) {
			if(count != 0) {
				System.out.print(numbers.get(count) + " ");
			} else {
				System.out.println(numbers.get(count));
			}
		}

	}

}