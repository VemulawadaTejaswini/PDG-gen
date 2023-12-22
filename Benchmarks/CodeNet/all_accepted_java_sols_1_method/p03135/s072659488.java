import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			float T = sc.nextFloat();
			float X = sc.nextFloat();
			System.out.println(T / X);

		}
	}
}