import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String CASE = "Case ";
		int count = 0;
		while (true) {
			count++;
			int i = scanner.nextInt();
			if (i == 0)
				break;
			System.out.println(CASE+count+": "+i);
		}
		scanner.close();
	}
}