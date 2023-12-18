import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}
		int tempMin = numbers[0];
		int count = 1;
		for(int i = 1; i < n; i++) {
			if(numbers[i] < tempMin) {
				count++;
				tempMin = numbers[i];
			}
		}
		System.out.println(count);	
	}
}
