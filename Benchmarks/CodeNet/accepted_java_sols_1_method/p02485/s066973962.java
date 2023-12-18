import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
			while (true) {
				String numbers = scanner.next();
				if (numbers.equals("0")) break;
				int sum = 0;
				
					for (int i = 0; i < numbers.length(); i++) {
						sum += Integer.parseInt("" + numbers.charAt(i));
					}
					
					System.out.println(sum);
			}
	}
}