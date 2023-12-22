import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(scanner.hasNext()){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x =a + b;
			String y = Integer.toString(x);
			System.out.println(y.length());
		}

	}
}