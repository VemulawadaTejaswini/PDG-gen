import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		int result = 1;
		char[] array = scanner.next().toCharArray();
		scanner.close();
		for (int i = 1; i < array.length; i++) {
			if(array[i - 1] != array[i]) ++result;
		}
		System.out.println(result);
	}
}