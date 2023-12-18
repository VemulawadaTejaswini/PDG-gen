import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());

		String numbers = scanner.nextLine();

		int quantity = Integer.parseInt(scanner.nextLine());

		SumSum sussm = new SumSum(numbers);

		for (int i = 0; i < quantity; i++) {
			sussm.run(scanner.nextLine());
		}
	}
}




class SumSum {
	
//	public static void main(String[] args) {
//		Va.main(null);
//	}

	private String[] array;
	private int[] arrayNumbers = new int[100001];
	private long sum;
	

	public SumSum(String numbers) {
		this.array = numbers.split(" ");
		createIntArray();
	}

	public void run(String numbersForChage) {
		String[] twoNumber = numbersForChage.split(" ");
		int oldNumber = Integer.parseInt(twoNumber[0]);
		int newNumber = Integer.parseInt(twoNumber[1]);
		int quantity = arrayNumbers[oldNumber];
		if (quantity == 0) {
			System.out.println(sum);
			return;
		}

		int difference = newNumber - oldNumber;
		sum += (difference * quantity);
		System.out.println(sum);
		arrayNumbers[oldNumber] = 0;
		arrayNumbers[newNumber] += quantity;
}

	private void createIntArray() {
		for (String s : array) {
			int number = Integer.parseInt(s);
			arrayNumbers[number] += 1;
			sum += number;
		}
	}
	
}