import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int chosen = scanner.nextInt();
		int[] numbers = new int[length];
		for(int i = 0; i < length; i++) 
			numbers[i] = scanner.nextInt();
		
		Arrays.sort(numbers);
		
		long result = 0l;
		for(int i = 0; i < chosen; i++) 
			result += numbers[i];
		System.out.print(result);
	}
}
