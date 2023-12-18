import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt(), day = scan.nextInt();
		int count = 0;
		for (int k = 4; k < month+1; k++)
			for (int i = 2; i < 10; i++)
				for (int j = 2; j < 10; j++) {
					if (i * j == k && 10 * i + j <= day) {
						count++;
					}
				}
		System.out.println(count);
	}
}
