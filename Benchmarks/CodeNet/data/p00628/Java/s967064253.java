import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String line;
		int length;
		int count;
		
		line = sc.nextLine();
		while (!line.equals("END OF INPUT")) {
			count = 0;
			length = line.length();
			for (int i = 0; i < length; i++) {
				if (line.charAt(i) != ' ') {
					count++;
				} else {
					System.out.print(count);
					count = 0;
				}
			}
			System.out.println(count);
			line = sc.nextLine();
		}
	}
}