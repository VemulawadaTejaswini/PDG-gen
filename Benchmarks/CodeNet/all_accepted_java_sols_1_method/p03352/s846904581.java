import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int table[] = new int[X + 1];

		int Max = 1;
		for (int i = 2; i < Math.sqrt(X); i++) {
			int p = 2;
			int tmp;
			while ((int) Math.pow(i, p) <= X) {
				p++;
			}
			Max = Math.max(Max, (int) Math.pow(i, p - 1));
		}
		System.out.println(Max);
	}

}
