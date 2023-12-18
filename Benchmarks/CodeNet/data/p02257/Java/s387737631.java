import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length;
		int[] numbers;
		length = input.nextInt();
		if(1 <= length && length <= 10000) {
			
		
		numbers = new int[length];
		for(int i = 0; i < length; i ++) {
			numbers[i] = input.nextInt();
			if(numbers[i] < 2 || numbers[i] > 100000000) {
				System.out.println("Enter numbers between 2 and 100000000");
				System.exit(0);
				
			}
		}
		input.close();
		int count = 0;
		for(int i = 0; i < length; i ++) {
			if(isPrime(numbers[i])) {
				count ++;
			}
		}
		System.out.println(count);
		}
		else {
			System.out.println("Enter a list size between 1 and 10000");
			System.exit(0);
		}
	}
	
	public static boolean isPrime(int num) {
		
		if(num % 2 == 0 && num != 2) {
			return false;
		}
			
		for(int i = 3; i * i <= num; i += 2) {
			if(num % i == 0) {
				return false;
			}}
	
		return true;
			
		}

}

