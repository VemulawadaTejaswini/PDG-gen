import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {

		Scanner scanner = new Scanner(System.in);
		int numOfSheep = scanner.nextInt();
		int numOfWolf = scanner.nextInt();

		if(numOfSheep<=numOfWolf) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}

		scanner.close();
	}
}