import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Main col = new Main();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		List<Integer> number = new ArrayList<Integer>();
		number.add(input);
		int minimum = 1000000;
		for (int i = 1; i <= 1000000; i++) {
			int result = col.returnNumbers(number.get(i - 1));
//			System.out.println("i = "+i +" " +result);
			if (number.contains(result)) {
				minimum = i + 1;
				break;
			}
			number.add(result);
		}
		System.out.print(minimum);

	}

	public int returnNumbers(int x) {
		if (x % 2 == 0)
			return x / 2;
		else
			return 3 * x + 1;
	}
}
