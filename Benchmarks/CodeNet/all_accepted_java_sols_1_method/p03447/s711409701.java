import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int count = (x - a) / b;
			int result = x - a - b * count;
			System.out.println(result);
		}

	}

}