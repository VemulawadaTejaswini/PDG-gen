import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		scanner.close();
		
		int result = i % 1000;
		int t = i / 1000;
		
		if (result == 0) {
			System.out.println(0);
		} else {
			System.out.println(((t + 1) * 1000) - i);
		}
	
	}

}
