import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int count = 0;
		
		for (int i = 1; i <= N; i++) {
			String str = String.valueOf(i);
			int length = str.length();
			
			if (length % 2 == 1) {
				count++;
			}
		}

		System.out.println(count);
	}
}