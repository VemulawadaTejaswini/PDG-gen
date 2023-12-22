import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		int k = scanner.nextInt();
		
		if(e - a > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
		
		scanner.close();

	}

}