import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		int sum = 0;


		for(int i = 0; i < n; i++){
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		Arrays.sort(numbers);

		System.out.println(numbers[0] + " " + numbers[n-1] + " " + sum);
	}
}