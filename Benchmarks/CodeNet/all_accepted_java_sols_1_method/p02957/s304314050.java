import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if((num1+num2)%2 == 0)
			System.out.println((num1+num2)/2);
		else
			System.out.println("IMPOSSIBLE");
		
		input.close();

	}

}
