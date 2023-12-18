import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		scanner.close();
		
		if (i == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
