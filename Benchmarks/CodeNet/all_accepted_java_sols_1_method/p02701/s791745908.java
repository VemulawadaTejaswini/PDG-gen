import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String[] gift = new String[num];

		sc.nextLine();
		for (int i = 0; i < num; i++) {
			gift[i] = sc.nextLine();
		}

		Arrays.sort(gift);

		int cnt = 1;
		for (int i = 0; i < num - 1; i++) {
			if (!gift[i].equals(gift[i + 1])) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}
