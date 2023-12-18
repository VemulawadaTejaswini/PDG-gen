import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int L = scan.nextInt();	
		
		System.out.println((double)L * L * L /27);
	}
}