import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt()-1;
		int b = scanner.nextInt()-1;
		
		System.out.println(a*b);
		
		scanner.close();
	}

}