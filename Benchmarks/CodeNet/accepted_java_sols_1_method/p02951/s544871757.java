import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int z = 0;
		
		if (a-b >= c ) {
			z = 0;
		} else {
			z = c - (a-b);
		}
      
		System.out.println(z);
	}

}
