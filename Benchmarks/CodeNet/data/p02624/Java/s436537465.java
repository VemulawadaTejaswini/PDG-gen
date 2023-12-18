import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		long result = 0l;
		for(int i = 1; i <= number; i++) {
			int temporal = number / i;
			long add = 1l * temporal * (temporal + 1) / 2 * i;
			result += add;			
		}
		System.out.println(result);
		
	}
}
