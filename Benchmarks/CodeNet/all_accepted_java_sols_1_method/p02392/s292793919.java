import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			
		}

	}

}

