import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		String Rine = "0";
		int sum = 0, i = 0;
		int number = line.length();
		while (line.charAt(0) != 0) {
			for (i = 0; i <= number - 1; i++) {
				System.out.println(line.charAt(i));
				int a = (line.charAt(i) - Rine.charAt(0));
				sum = sum + a;
			}
			System.out.println(sum);
			line = scan.next();
		}
		scan.close();
	}

}