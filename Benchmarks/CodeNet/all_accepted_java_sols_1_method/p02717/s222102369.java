import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		int c = scanner.nextInt();
		
		scanner.close();
		
		int t;
		
		t = a;
		
		a = b;
		
		b = t;
		
		t = a;
		
		a = c;
		
		c = t;
		
		System.out.println(a + " " + b + " " + c);
	}
}
