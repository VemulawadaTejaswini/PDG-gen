import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int[] numbers;
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		if (!"".equals(num.trim())) {
			String[] input = num.split(" ");
			numbers = new int[input.length];
			for(int i = 0; i< input.length; i++) {				
				numbers[i] = Integer.parseInt(input[i]);
			}
			Arrays.sort(numbers);
			System.out.println(Arrays.toString(numbers));
		}		
	}
}