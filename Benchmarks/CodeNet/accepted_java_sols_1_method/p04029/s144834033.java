import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int max = 0;

		for (i = 1; i < n + 1; i++) {
			max = max + i;
		}

		System.out.println(max);

	}

}