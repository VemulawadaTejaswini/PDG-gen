import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		int sum = 0, i = 0;
		int number = line.length();
		while (line.charAt(0) != 0) {
			for (i = 0; i < number; i++) {
				sum = sum + line.charAt(i);
			}
		}
		System.out.println(sum);
	}

}