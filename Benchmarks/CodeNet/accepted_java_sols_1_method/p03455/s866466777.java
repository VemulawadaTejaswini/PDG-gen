
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a%2 == 1 && b%2 == 1){
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}

	}

}
