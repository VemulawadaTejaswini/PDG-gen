import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int max = a+b;
		
		int sub = a-b;
		int mul = a*b;
		
		if (sub>max) {
			max = sub;
		}
		
		if (mul>max) {
			max = mul;
		}
		
		System.out.println(max);
		
		
		scanner.close();
	}

}
