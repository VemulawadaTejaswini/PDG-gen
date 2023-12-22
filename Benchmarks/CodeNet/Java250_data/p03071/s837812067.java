import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int AB[] = new int[2];

		for (int i = 0; i < 2; i++) {
			AB[i] = sc.nextInt();
		}

		Arrays.sort(AB);

		int s = 0;

		for (int i = 0; i < 2; i++) {
			s += AB[1];
			AB[1]--;
			Arrays.sort(AB);
		}
		System.out.println(s);
	}
}