import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		
		int result = (num1-1)*(num2-1);
		System.out.println(result);
		
	}

}
