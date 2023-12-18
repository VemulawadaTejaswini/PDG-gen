import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int a = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
			final int b = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
			
			System.out.println(a >= b ? a : b);
		}
	}

}