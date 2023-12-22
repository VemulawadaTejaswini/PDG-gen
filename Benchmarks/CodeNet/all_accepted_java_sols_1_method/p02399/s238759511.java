import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);){
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			System.out.format("%d %d %.6f\n", a / b, a % b, (double)a / b);
		}
	}
}
