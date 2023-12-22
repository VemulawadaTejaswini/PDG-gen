import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] numbers = new int[length];
		numbers[0] = scanner.nextInt();
		int xor = numbers[0];
		for(int i = 1; i < length; i++) {
			numbers[i] = scanner.nextInt();
			xor ^= numbers[i];
		}
		
		for(int i = 0; i < length; i++) 
			System.out.print((xor ^ numbers[i]) + " ");
		
	}
}
