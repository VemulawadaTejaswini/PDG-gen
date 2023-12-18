import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			int x = scan.nextInt();

			System.out.println(x==0?1:0);
		}


	}


}
