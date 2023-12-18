import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j = 1;
		Scanner sc = new Scanner(System.in);
		do {
			i = sc.nextInt();
			if (i != 0) {
				System.out.println("Case " + j + ": " + i);
				j++;
			}
		} while (i != 0);
	}
}