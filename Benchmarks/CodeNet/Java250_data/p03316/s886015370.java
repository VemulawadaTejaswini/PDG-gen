import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		long input = Long.parseLong(inputLine);
		long inputCopy = input;
		int div = 0;
		int digits = (int)Math.log(input);
		
		for(;digits >= 0;--digits) {
			div += inputCopy / Math.pow(10, digits);
			inputCopy = inputCopy % (long)Math.pow(10, digits);
		}
		
		sc.close();
		if(input % div == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}